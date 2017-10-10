package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {

	private Calculator calculator;
		
		@Before
		public void setUp() {
			calculator = new Calculator();
		}
	
		@Test
		public void addTest() {
			assertEquals(5, calculator.add(3, 2));
		}
				
		@Test
		public void subtractTest() {
			assertEquals(5, calculator.subtract(10, 5));
		}
		
		@Test
		public void multiplyTest() {
			assertEquals(10, calculator.multiply(5, 2));
		}
		
		@Test
		public void divideTest() {
			assertEquals(2, calculator.divide(10, 5));
		}
		
		@Test
		public void isEqualTrueTest() {
			assertTrue(calculator.isEqual(10, 10));
		}
		
		@Test
		public void isEqualFalseeTest() {
			assertFalse(calculator.isEqual(5, 10));
		}
}
