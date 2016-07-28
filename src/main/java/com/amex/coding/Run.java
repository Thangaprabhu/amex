package com.amex.coding;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Instructions: View each class for requirements.

		// Problem 1
		Problem1_FizzBuzz fb = new Problem1_FizzBuzz();
		fb.print();

		// Problem 2
		Problem2_Recursion rec = new Problem2_Recursion();
		String inputStr = "String to reverse";
		String outputStr = rec.reverseString(inputStr);
		System.out.println(outputStr);

		// Problem 3
		Problem3_Collections coll = new Problem3_Collections();
		coll.collectionFun();

		// Problem 4
		Person pMatt_1 = new Person("Matt", (byte) 36, "1678", "PHX", "AZ", (short) 85085);
		Person pMatt_2 = new Person("Matt", (byte) 36, "1678", "PHX", "AZ", (short) 85085);
		Problem4_Match match = new Problem4_Match();
		System.out.println("Match = " + match.doTheyMatch(pMatt_1, pMatt_2));
	}
}
