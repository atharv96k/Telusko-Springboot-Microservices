package com.master.SpringSecurity01.service;

import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims; 
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JWTTokenService {

//	private String secretKey = "asgvaa9e45bvbvresjgv34babcs8fg7b8w45748yv84y8tfh4vvbbbb854836hghdsigvsnrgtbr8348h";
	private String secretKey;

	//Step-3
	public JWTTokenService() {
		this.secretKey = getSecretKey();
	}

	//Step-4
	private String getSecretKey() {
		try {
			KeyGenerator key = KeyGenerator.getInstance("HmacSHA256");
			SecretKey secret = key.generateKey();
			return Base64.getEncoder().encodeToString(secret.getEncoded());
		}
		catch (Exception e) {
			throw new RuntimeException("Error in Generating Key");
		}
	}

	//Step-1
	public String generateToken(String username) {
		Map<String , Object> claims = new HashMap<>();
		
		return Jwts.builder()
				.setClaims(claims)
				.setSubject(username)
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 180000000))
				.signWith(getkey(), SignatureAlgorithm.HS256)
				.compact();
		
	}

	//Step-2
	private Key getkey() { 
		byte[] b = Decoders.BASE64.decode(secretKey);
		return Keys.hmacShaKeyFor(b);
	} 
	
	//Not Coded By Hyder Abbas (Not Understanded)
	
	//after JWTFilter
	public String extractUserName(String token) {
		return extractClaim(token,Claims::getSubject);
	}

	private <T> T extractClaim(String token, Function<Claims, T> claimResolver) {
		System.out.println("Token in extract claim "+token);
		final Claims claims = extractAllClaims(token);
		System.out.println("Claims : " + claims);
		return claimResolver.apply(claims);
	}

	private Claims extractAllClaims(String token) {
		System.out.println("Token to extract all claims :" + token);
		return Jwts
				.parser().
				setSigningKey(getkey())
				.build()
				.parseSignedClaims(token)
				.getPayload();
	}

	public Boolean validateToken(String token, UserDetails userDetails) {
		final String userName = extractUserName(token);
		return (userName.equals(userDetails.getUsername()) && !isTokenExpired(token));
	}

	private boolean isTokenExpired(String token) {
		System.out.println("Token is ex");
		return extractExpiration(token).before(new Date());
	}

	private Date extractExpiration(String token) {
	    return extractClaim(token, Claims::getExpiration);
	}
}
