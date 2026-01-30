package com.master.SpringAOPApplication.aspect;
 
import java.time.LocalTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AlienAOP {

	@Before(value = "execution(* com.master.SpringAOPApplication.rest.*.*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("Request Made To "+joinPoint.getSignature() + " at "+LocalTime.now());
	}
	
	@Before(value = "execution(* com.master.SpringAOPApplication.service.AlienService.*(..))")
	public void beforeAnotherAdvice(JoinPoint joinPoint) {
		System.out.println("Request Made To "+joinPoint.getSignature() + " at "+LocalTime.now());
	}
	
	@After(value = "execution(* com.master.SpringAOPApplication.rest.*.*(..))")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("Request Made To "+joinPoint.getSignature() + " at "+LocalTime.now());
	}
	
	@After(value = "execution(* com.master.SpringAOPApplication.service.AlienService.*(..))")
	public void afterAnotherAdvice(JoinPoint joinPoint) {
		System.out.println("Request Made To "+joinPoint.getSignature() + " at "+LocalTime.now());
	}
}
