package com.tdd.demo.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

	
	public static int add(String input) {
		if(input.isEmpty()) {
			return 0;
		}
			String[] finalar=tokenize(input);
			return sum(finalar);
		}
	
	public static String[] tokenize(String input) {
		
		String[] sar;
		if(input.startsWith("//")){
			Matcher matcher=Pattern.compile("//(.)\n(.*)").matcher(input);
			matcher.matches();
			String customDelimiter=matcher.group(1);
			String numbers=matcher.group(2);
			sar=numbers.split(customDelimiter);
		}else {
			sar=input.split(",|\n");
		}
		return sar;
	}
	
	public static int sum(String[] sar) throws RuntimeException{
	
		int sum=0;
		for(int i=0;i<sar.length;i++) {
			if(convertStringToInt(sar[i])<0) {
				throw new RuntimeException("Negetives not allowed");
			}
			sum+=convertStringToInt(sar[i]);
		}
		return sum;
	}
		
	
	public static int convertStringToInt(String s) throws NumberFormatException{
		return Integer.valueOf(s);
	}
}
