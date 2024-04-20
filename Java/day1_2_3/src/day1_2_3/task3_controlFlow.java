/*
 Write a java program that reads an integer, and prints if it is prime integer using a for loop and if statements.
 */

package day1_2_3;

import java.util.Scanner;

public class task3_controlFlow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it is a prime or not");
		int n = sc.nextInt();
		boolean isPrime = true;
		for(int i=2; i<=Math.sqrt(n); i++)
		{
			if(n%i==0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime==true) System.out.println("The number "+n+" is prime");
		else System.out.println("The number "+n+" is non-prime");
		sc.close();
	}

}
