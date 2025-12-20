package com.master.main.dao;

public class Password {

	String algo;
	public Password(String algo) {
		this.algo = algo;
		System.out.println("Password bean created");
	}
	
	public void getPassAlgo() {
		System.out.println("The algorithm used for password is "+algo);
	}
}
