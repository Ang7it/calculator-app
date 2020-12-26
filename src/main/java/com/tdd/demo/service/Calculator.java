package com.tdd.demo.service;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(add("1,2\n3"));
	}
	
	public static int add(String input) {
		if(input.isEmpty()) {
			return 0;
		}else {
			String[] sar=input.split(",|\n");
			int sum=0;
			for(int i=0;i<sar.length;i++) {
				sum+=convertStringToInt(sar[i]);
			}
			return sum;
		}
	}
	
	public static int convertStringToInt(String s) throws NumberFormatException{
		return Integer.valueOf(s);
	}
}
