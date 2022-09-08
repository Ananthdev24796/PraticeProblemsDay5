/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Iam_A
 *
 */
public class Vowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the character to check");
		char c=input.next().charAt(0) ;
		switch (c)
		{
		 case 'a':
         case 'e':
         case 'i':
         case 'o':
         case 'u':
             System.out.println(c + " is vowel");
             break;
         default:
             System.out.println(c + " is consonant");
     }
		}
		

	}


