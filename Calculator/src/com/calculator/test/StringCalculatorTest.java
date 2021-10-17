package com.calculator.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.calculator.main.StringCalculator;

public class StringCalculatorTest {

	public static void main(String[] args) {
		org.junit.runner.JUnitCore.main("com.calculator.test.StringCalculatorTest");
	}
	
	@Test
	public void test_empty_string() {
		assertEquals(0, StringCalculator.add(""));;
	}
	
	@Test
	public void test_one_number() {
		assertEquals(1, StringCalculator.add("1"));
	}
	
	@Test
	public void test_two_numbers() {
		assertEquals(3, StringCalculator.add("1,2"));
	}
	
	@Test
	public void test_three_numbers() {
		assertEquals(6,StringCalculator.add("1,2,3"));
	}
	
	

}
