/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Iam_A
 *
 */
public class LeapYear {
	/**
	 * To Check Leap Year or Not
	 */
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the Year to Check LeapYear or Not");
		int year =input.nextInt();
		if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Not a Leap Year");
		}
 }
}
