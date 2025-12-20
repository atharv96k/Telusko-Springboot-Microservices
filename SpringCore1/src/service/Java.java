package service;

public class Java implements ICourse
{

	@Override
	public Boolean getTheCourse(Double amount) {
		System.out.println("Java course is purchased and Amount is paid "+amount);
		return true;
	}

}
