package com.master;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString string = new ReverseString();
		assertEquals("avaJ",string.reverseString("Java"));
	}

}
