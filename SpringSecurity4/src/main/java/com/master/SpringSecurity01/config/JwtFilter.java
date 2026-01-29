package com.master.SpringSecurity01.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.master.SpringSecurity01.service.JWTTokenService;
import com.master.SpringSecurity01.service.MYUserDetailsService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtFilter extends OncePerRequestFilter{

	@Autowired
	private JWTTokenService service;
	
	@Autowired
	private MYUserDetailsService userService;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		String authheader = request.getHeader("Authorization");
		
		String token = null;
		String name = null;
		if (authheader != null && authheader.startsWith("Bearer ")) {
			{
				 token = authheader.substring(7);
				 name=service.extractUserName(token);
			}
			
			//If Name is present and auth obj is not created then...
			if (name != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			    
			    // Load user details from the database
			    UserDetails userDetails = userService.loadUserByUsername(name);
			    
			    // Check if the token is valid (matches user and not expired)
			    Boolean status = service.validateToken(token, userDetails);
			    
			    if (status) {
			        // Create an Authentication Token
			        UsernamePasswordAuthenticationToken authToken = 
			                new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
			        
			        // Build details (like IP address, etc.) into the token
			        authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
			        
			        // THE MOST IMPORTANT STEP: Set the security context!
			        SecurityContextHolder.getContext().setAuthentication(authToken);
			    }
			}
		}
		
		filterChain.doFilter(request, response);
		
	}

}
