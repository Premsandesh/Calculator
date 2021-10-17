package com.calculator.main;

public class StringCalculator {

	public static int add(String numbers) {
		if(numbers.equals("")) 
		  return 0;	
		else {
			String delimiter =",";
			if(numbers.matches("//(.*)\n(.*)")) {
				delimiter=Character.toString(numbers.charAt(2));
				numbers=numbers.substring(4);
			}
			String numList[]=splitNumbers(numbers,delimiter+"|\n"+"|\n");
			return sum(numList);
		}
	}
	
	private static String[] splitNumbers(String numbers, String s) {
	    return numbers.split(s);
	}
	
	private static int sum(String[] givenNumbers) {
		int total=0;
		
		for(String number:givenNumbers) {
			if(toInt(number)<0) {
				
			}
				total+=toInt(number);
		}
		return total;	
	}
	
	private static int toInt(String n) {
		return Integer.parseInt(n);
	}
}
