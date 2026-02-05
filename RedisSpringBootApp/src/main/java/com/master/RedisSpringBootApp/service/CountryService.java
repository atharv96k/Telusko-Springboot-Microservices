package com.master.RedisSpringBootApp.service;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.master.RedisSpringBootApp.model.Country;

@Service
public class CountryService {

	private HashOperations<String, Object, Object> opsForHash = null;
	
	public CountryService(RedisTemplate<String, Country> redis) {
		opsForHash=redis.opsForHash();
	}
	
	public String addCountry(Country country) {
		opsForHash.put("Countries", country.getNo(), country);
		return "Country data added into redis server";
	}
}
