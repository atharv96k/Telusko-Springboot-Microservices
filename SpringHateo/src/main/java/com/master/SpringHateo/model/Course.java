package com.master.SpringHateo.model;

import org.springframework.hateoas.RepresentationModel;

public class Course extends RepresentationModel<Course>
{
	private Integer cid;
	
	private String cName;
	
	private Double cPrice;

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Double getcPrice() {
		return cPrice;
	}

	public void setcPrice(Double cPrice) {
		this.cPrice = cPrice;
	}

	public Course(Integer cid, String cName, Double cPrice) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.cPrice = cPrice;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cName=" + cName + ", cPrice=" + cPrice + "]";
	}
	
	
}
