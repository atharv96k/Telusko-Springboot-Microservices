package com.master.service;

public class Java implements ICourse
{

	public Java()
	{
		System.out.println("Java Bean Created");
	}
	
	@Override
	public Boolean getTheCourse(Double amount) {
		System.out.println("Java course is purchased and Amount is paid "+amount);
		return true;
	}

}
