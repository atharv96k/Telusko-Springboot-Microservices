package com.master;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		
		Calc div = new Calc();
		Integer result=div.divide(18,6);
		System.out.println(result);
		Integer expecctedRes = 3;
		
		assertEquals(expecctedRes, result);
		
	}

}
