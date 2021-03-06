package com.tdd.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void shouldReturn0OnEmptyString() {
		
		assertEquals(0, Calculator.add(""));
	}
	
	
	@Test
	public void shouldReturnNumberOnNumber() {
		assertEquals(1, Calculator.add("1"));
	}
	
	@Test
	public void shouldReturnSumOfTwoNumbersSeperatedByComma() {
		
		assertEquals(3,Calculator.add("1,2"));
	}
	
	@Test
	public void shouldReturnSumForMultipleNumbersSeperatedByComma() {
		
		assertEquals(6, Calculator.add("1,2,3"));
	}
	
	@Test
	public void shouldAcceptNewLineAsDelimiter() {
		
		assertEquals(6, Calculator.add("1,2\n3"));
	}
	
	@Test
	public void shouldAcceptCustomDelimiter() {
		
		assertEquals(3, Calculator.add("//;\n1;2"));
	}
	
	@Test
	public void shouldThrowExceptionForNegetiveNumbers() {
		
		Exception exception=assertThrows(RuntimeException.class, ()-> {
			Calculator.add("1,-2,3,-4");
		});
		String expected="Negetives not allowed";
		String actual=exception.getMessage();
		
		assertEquals(expected, actual);
	}
}
