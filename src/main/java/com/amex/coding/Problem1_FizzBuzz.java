package com.amex.coding;

public class Problem1_FizzBuzz {

	/**
	 * Requirements: Output the numbers 1-100, with one number on every row. If
	 * the number is a multiple of 3 output an F instead of the number. If the
	 * number is a multiple of 5 output an B instead of the number. If the
	 * number is a multiple of 15 output output an FB instead of the number.
	 */
	public void print() {
		for (int i = 1; i <= 100; i++) {
			System.out.println((0 == i % 15 ? "FB" : (0 == i % 3 ? "F" : (0 == i % 5 ? "B" : i + ""))));
		}

	}

	public static void main(String[] args) {
		Problem1_FizzBuzz fizzBuzz = new Problem1_FizzBuzz();
		fizzBuzz.print();
	}
}
