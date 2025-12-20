package com.master.dto;

public class CustomerDTO {
	
	private String id;
	
	private Integer cNum;
	
	private String cName;
	
	private String cCity;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getcNum() {
		return cNum;
	}

	public void setcNum(Integer cNum) {
		this.cNum = cNum;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcCity() {
		return cCity;
	}

	public void setcCity(String cCity) {
		this.cCity = cCity;
	}
	
	public CustomerDTO(String id, Integer cNum, String cName, String cCity) {
		super();
		this.id = id;
		this.cNum = cNum;
		this.cName = cName;
		this.cCity = cCity;
	}

	public CustomerDTO() {
		super();
	}

	@Override
	public String toString() {
		return "CustomerDTO [id=" + id + ", cNum=" + cNum + ", cName=" + cName + ", cCity=" + cCity + "]";
	}
	
}
