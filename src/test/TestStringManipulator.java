package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.StringManipulator;

public class TestStringManipulator {

	@Test
	public void testAddStrings() {
		assertEquals(StringManipulator.add("hello", " there"), "hello there");
	}
	
	@Test
	public void testMakeNotNullWithNotNull() {
		String str = "a";
		assertNotNull(StringManipulator.makeNotNull(str));
	}
	
	@Test
	public void testMakeNotNullWithNull() {
		String str = null;
		assertNotNull(StringManipulator.makeNotNull(str));
	}

}
