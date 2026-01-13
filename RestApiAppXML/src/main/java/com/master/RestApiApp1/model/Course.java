package com.master.RestApiApp1.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;


@JacksonXmlRootElement
public class Course {
	private Integer id;

	private String cname;

	private String duration;

	private Double rate;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Course(Integer id, String cname, String duration, Double rate) {
		super();
		this.id = id;
		this.cname = cname;
		this.duration = duration;
		this.rate = rate;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", cname=" + cname + ", duration=" + duration + ", rate=" + rate + "]";
	}


}
