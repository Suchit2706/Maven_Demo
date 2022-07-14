package com.lti.demo;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.entity.Calculator;

class CalculatorTest {
	
	Calculator c =new Calculator();

	@Test
	public void testAdd() {
		int r = c.add(100, 200);
		Assertions.assertEquals(300, r);
	}
	@Test
	public void testAssertFalse() {
		Assertions.assertEquals("Hello","Hello");
		Assertions.assertFalse("Something".length()!=9);
	}
	@Test
	public void testAssertNull() {
		String str1=null;
		String str2="Acb";
		Assertions.assertNull(str1);
		Assertions.assertNotNull(str2);
	}
	@Test
	public void testAssertArray() {
		ArrayList<Integer> list = new ArrayList<>();
		Assertions.assertEquals(0 , list.size());
	}

}
