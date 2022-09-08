/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Iam_A
 *
 */
public class QuotientAndReminder {
	/**
	 * To find the QuotientAndReminder
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Dividend and Divisor");
		int Dividend =input.nextInt();
		int Divisor =input.nextInt();
		
		int quotient = Dividend/Divisor;
		int reminder =Dividend%Divisor;
		
		System.out.println("quotient:"+ quotient);
		System.out.println("reminder:"+ reminder);
		

	}
}
