/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Iam_A
 *
 */
public class Hormonic {
	/**
	 * To Print Harmoic Numbers
	 */
	public static void main(String[] args) {
		double num =0;
		double i;
		double result = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number ");
		double n=input.nextDouble();
		for( i=1;i<=n;i++) {
			num = num+(1/i);
			result = num;
		}
		System.out.println(result);

	}
}
