package com.master.model;

public class Course {

	private Integer cid;
	private String cname;
	private Double cprice;
	public Course(Integer cid, String cname, Double cprice) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cprice = cprice;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Double getCprice() {
		return cprice;
	}
	public void setCprice(Double cprice) {
		this.cprice = cprice;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cprice=" + cprice + "]";
	}
	
	
	
	
}
