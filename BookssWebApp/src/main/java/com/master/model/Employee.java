package com.master.model;

public class Employee {
	private Integer eid;
	private String ename;
	private String ecity;
	private String esalary;
	public Employee(Integer eid, String ename, String ecity, String esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ecity = ecity;
		this.esalary = esalary;
	}
	public Employee() {
		super(); 
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEcity() {
		return ecity;
	}
	public void setEcity(String ecity) {
		this.ecity = ecity;
	}
	public String getEsalary() {
		return esalary;
	}
	public void setEsalary(String esalary) {
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", ecity=" + ecity + ", esalary=" + esalary + "]";
	}
	
}
