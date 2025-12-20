package main;

import service.ICourse;

public class Master {
	
	private ICourse course;
	
	//Constructor Injection
	public Master(ICourse course) {
		super();
		System.out.println("Constructor Injection");
		this.course = course;
	}


	public Master() {
		super();
		System.out.println("Master Bean Created");
	}

	//Setter Injection
	public void setCourse(ICourse course) {
		System.out.println("Setter Injection");
		this.course = course;
	}

	public boolean buyTheCourse(Double amount)
	{
		return course.getTheCourse(amount);
	}
}
