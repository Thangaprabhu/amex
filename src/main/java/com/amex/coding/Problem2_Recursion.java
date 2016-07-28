package com.amex.coding;

public class Problem2_Recursion {

	// Requirements: reverse the input string by using recursion.
	public String reverseString(String inputStr) {
		if(1 == inputStr.length()) {
			return inputStr;
		}
		return reverseString(inputStr.substring(1, inputStr.length()))+inputStr.charAt(0);
	}
	
	public static void main(String[] args) {
		Problem2_Recursion reverseString = new Problem2_Recursion();
		System.out.println(reverseString.reverseString("helloTest"));
	}
}
