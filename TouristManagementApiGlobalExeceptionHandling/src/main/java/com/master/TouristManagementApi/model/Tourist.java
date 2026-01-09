package com.master.TouristManagementApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tourist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String packageType;
	
	private Double budget;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPackageType() {
		return packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	public Tourist(Integer id, String name, String packageType, Double budget) {
		super();
		this.id = id;
		this.name = name;
		this.packageType = packageType;
		this.budget = budget;
	}

	public Tourist() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tourist [id=" + id + ", name=" + name + ", packageType=" + packageType + ", budget=" + budget + "]";
	}
	
	
	
}
