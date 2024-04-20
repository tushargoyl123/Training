/*
 Create a program that simulates a simple calculator using command line arguments to perform and print the results of addition, substraction, multiplication and division.
 */

package day1_2_3;

import java.util.Scanner;

public class task2_operators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operator to perform the operation");
		char ch = sc.next().charAt(0);
		System.out.println("Enter the operands on which operation needs to be performed");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double result = 0;
		switch(ch) {
		case '+':
			result = a+b;
			break;
		case '-':
			result = a-b;
			break;
		case '*':
			result = a*b;
			break;
		case '/':
			if(b==0)
			{
				System.out.println("Error : Divide by 0");
				sc.close();
				return;
			}
			result = a/b;
			break;
		default:
			System.out.println("Error : Invalid input");
		}
		System.out.println("result is "+result);
		sc.close();
	}

}
