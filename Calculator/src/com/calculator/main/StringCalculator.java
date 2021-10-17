package com.calculator.main;

public class StringCalculator {
	static int addinvokecount=0;
	public static int add(String numbers) {
		addinvokecount++;
		if(numbers.equals("")) 
		  return 0;	
		else {
			String delimiter =",";
			String otherDelimeter=";";
			if(numbers.matches("//(.*)\n(.*)")) {
				delimiter=Character.toString(numbers.charAt(2));
				numbers=numbers.substring(4);
			}
			String numList[]=splitNumbers(numbers,delimiter+"|"+otherDelimeter+ "|\n") ;
			return sum(numList);
		}
	}
	
	private static String[] splitNumbers(String numbers, String s) {
	    return numbers.split(s);
	}
	
	private static int sum(String[] givenNumbers) {
		int total=0;
		int negetiveCount=0;

		String negetiveString="";
		for(String number:givenNumbers) {
			if(toInt(number)<0) {		
				negetiveString=number;
				negetiveCount++;
			}
			if(negetiveCount!=0)
				for(int i=0;i<negetiveCount;i++)
				throw new IllegalArgumentException("Negetive Not Allowed :"+ negetiveString);
			
			if(toInt(number)>=1000)
				continue;
				total+=toInt(number);
		}
		
		return total;	
	}
	
	private static int toInt(String n) {
		return Integer.parseInt(n);
	}
	
	public static int getCalledCount() {
		return addinvokecount;
	}
}
