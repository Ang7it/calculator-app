package com.tdd.demo.service;

public class Calculator {

	public static int add(String input) {
		if(input.isEmpty()) {
			return 0;
		}else if(input.contains(",")) {
			String[] sar=input.split(",");
			return Integer.valueOf(sar[0])+Integer.valueOf(sar[1]);
		}
		else {
			return Integer.valueOf(input);
		}
	}
}
