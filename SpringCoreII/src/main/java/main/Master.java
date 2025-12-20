package main;

import service.ICourse;

public class Master {
	
	private ICourse course;
	
	
	public Master(ICourse course) {
		super();
		this.course = course;
	}


	public Master() {
		super();
		System.out.println("Master Bean Created");
	}

	public void setCourse(ICourse course) {
		this.course = course;
	}

	public boolean buyTheCourse(Double amount)
	{
		return course.getTheCourse(amount);
	}
}
