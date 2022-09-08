/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Iam_A
 *
 */
public class FlipCoin {
	public static void main(String[] args) {
		int headcnt = 0,tailcnt = 0;
		double head,tail;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of time to flip coin ");
		int n = input.nextInt();
		System.out.println(n);
		for(int i=0;i<n;i++) {
		double random = Math.random();
		if(random < 0.5) {
			System.out.println("TAIL");
			tailcnt++;
			System.out.println("after ++"+tailcnt);
		}else {
			System.out.println("HEAD");
			headcnt++;
			System.out.println("after ++"+headcnt);
		}
		}
		head = headcnt/(double)n*100;
		tail = tailcnt/(double)n*100; 
		System.out.println("Percentage of head"+head);
		System.out.println("Percentage of tail"+tail);
		
	}

}
