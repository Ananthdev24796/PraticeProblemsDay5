/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Iam_A
 *
 */
public class PowerOfTwo {
	/**
	 * power of 2 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to check");
		int n=input.nextInt();
		int a =1;
		if(n>31) {
			System.out.println("Enter the number below 31");
			}
		else {
			for(int i=1;i<=n;i++) {
				a= a*2;
				System.out.println(a);
			}
		}

	}

}
