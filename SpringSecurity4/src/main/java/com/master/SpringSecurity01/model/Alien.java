package com.master.SpringSecurity01.model;

public class Alien {
	
	private int aId;
	
	private String aName;
	
	private String aCity;

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getaCity() {
		return aCity;
	}

	public void setaCity(String aCity) {
		this.aCity = aCity;
	}

	public Alien(int aId, String aName, String aCity) {
		super();
		this.aId = aId;
		this.aName = aName;
		this.aCity = aCity;
	}

	public Alien() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Alien [aId=" + aId + ", aName=" + aName + ", aCity=" + aCity + "]";
	}
	
	
}
