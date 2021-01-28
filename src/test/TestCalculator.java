package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Calculator;

public class TestCalculator {

	@Test
	public void testAdd() {
		assertTrue(Calculator.add(1, 1) == 1 + 1);
	}
	
	@Test
	public void testSubtract() {
		assertTrue(Calculator.subtract(1, 1) == 1 - 1);
	}
	
	@Test
	public void testDivide() {
		assertTrue(Calculator.divide(1, 2) == .5);
	}
	
	@Test
	public void testMultiply() {
		assertTrue(Calculator.multiply(1, 2) == 1 * 2);
	}

}
