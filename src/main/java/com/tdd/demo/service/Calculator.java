package com.tdd.demo.service;

public class Calculator {

	public static int add(String input) {
		if(input.isEmpty()) {
			return 0;
		}else if(input.contains(",")) {
			String[] sar=input.split(",");
			int sum=0;
			for(int i=0;i<sar.length;i++) {
				sum+=convertStringToInt(sar[i]);
			}
			return sum;
		}
		else {
			return Integer.valueOf(input);
		}
	}
	
	public static int convertStringToInt(String s) {
		return Integer.valueOf(s);
	}
}
