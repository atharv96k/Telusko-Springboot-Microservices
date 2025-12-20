package service;

public class Master {
	
	private ICourse course;//IOC
//
//	public void setCourse(ICourse course) {
//		this.course = course;
//	}

	public Master(ICourse course) {
		this.course = course;
	}
	
	public boolean buyTheCourse(Double amount)
	{
		return course.getTheCourse(amount);
	}
	
}
