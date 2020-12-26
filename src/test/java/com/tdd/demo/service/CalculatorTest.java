package com.tdd.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
