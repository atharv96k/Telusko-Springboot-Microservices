package main;

import service.Java;
import service.Master; 
//class Alpha
//{
//	public void alpha()
//	{
//		
//	}
//}
//
//class Beta
//{
//	public void beta()
//	{
//		
//	}
//}
public class LaunchApp 
{
	public static void main(String[] args) 
	{
		//Master m = new Master();//Target Class
		//Java j = new Java();
		//m.setiCourse(j);
		
		//Setter Injection - Used setter for DI
		//m.setCourse(new SpringBoot());//Dependency Injection - Injecting a dependent object(object whose methods are used) into the target class 
		
		//Constructor Injection 
		Master m = new Master(new Java());
		
		Boolean statusBoolean = m.buyTheCourse(4599.90);
		if (statusBoolean)
			System.out.println("Course enrolled successfully!");
		else
			System.out.println("Failed to enroll the course");
	}
}
