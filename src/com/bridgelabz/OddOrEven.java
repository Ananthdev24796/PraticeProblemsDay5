/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Iam_A
 *
 */
public class OddOrEven {
	/**
	 * To Check given number is odd or even
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numberto check odd or even");
		int n=input.nextInt();
		if(n%2!=0) {
			System.out.println("Number is odd");
			
		}else
			System.out.println("Number is even");

	}

}
