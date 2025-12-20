package service;

public class SpringBoot implements ICourse {

	@Override
	public Boolean getTheCourse(Double amount) {
		System.out.println("Springboot course is purchased and Amount is paid "+amount);
		return true;
	}

}
