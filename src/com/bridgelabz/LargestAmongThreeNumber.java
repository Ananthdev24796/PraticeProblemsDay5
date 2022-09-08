/**
 * 
 */
package com.bridgelabz;

/**
 * @author Iam_A
 *
 */
public class LargestAmongThreeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		        double n1 = 60.23, n2 = 31.9, n3 = 52.5;

		        if( n1 >= n2 && n1 >= n3)
		            System.out.println(n1 + " is the largest number.");

		        else if (n2 >= n1 && n2 >= n3)
		            System.out.println(n2 + " is the largest number.");

		        else
		            System.out.println(n3 + " is the largest number.");
		    }

	}


