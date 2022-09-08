/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Iam_A
 *
 */
public class Fact {
	/**
	 * To print the factor of entered number
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=input.nextInt();

		System.out.print("The Prime Factors of " + n + " are : ");
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+ " ");
			}
		}

	}
}
