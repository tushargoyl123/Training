/*
 Write a program that declares 2 integer variables, swap their values without using a third variable, and print the result. 
 */
package day1_2_3;

import java.util.Scanner;

public class task1_DataTypes_Variables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 numbers a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		sc.close();
	}

}
