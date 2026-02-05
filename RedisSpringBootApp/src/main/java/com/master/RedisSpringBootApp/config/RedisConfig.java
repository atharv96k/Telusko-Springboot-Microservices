package com.master.RedisSpringBootApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.master.RedisSpringBootApp.model.Country;

@Configuration
public class RedisConfig {
	@Bean
	public JedisConnectionFactory jedisConnection() {
		JedisConnectionFactory jedis = new JedisConnectionFactory();
		return jedis;
	}
	
	@Bean
	public RedisTemplate<String , Country> redisTemplate(){
		RedisTemplate<String , Country> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(jedisConnection());
		return redisTemplate;
	}
}
