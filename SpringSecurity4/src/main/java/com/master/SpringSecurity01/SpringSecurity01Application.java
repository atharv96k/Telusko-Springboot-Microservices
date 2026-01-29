package com.master.SpringSecurity01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *Spring Security Imp Points - i) By default, Spring Security uses HTTP Basic authentication.
 * ii) It automatically creates a default user with a generated password, which is logged in the
 * console when the application starts.
 * iii) Spring Security provides various authentication mechanisms, including form-based login, 
 * OAuth2, and LDA	P.
 * iv) It also offers features like CSRF protection, session management, and access control based
 * on roles and permissions.
 * v) Spring Security can be easily integrated with other Spring projects, such as Spring Boot
 * and Spring Data.
 * 
 * @Author Atharv Mohite
 */
@SpringBootApplication
public class SpringSecurity01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurity01Application.class, args);
	} 
}
