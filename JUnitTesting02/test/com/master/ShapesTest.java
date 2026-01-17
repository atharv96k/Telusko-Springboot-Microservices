package com.master;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	Shapes shapes = new Shapes();
	
	@Test
	void testSquareArea() {
		assertEquals(2209,shapes.calculateArea(47));
	}

	@Test
	void testCircleArea() {
		assertEquals(50.24, shapes.calculateCircleArea(4),"Something went wrong!");
	}
}
