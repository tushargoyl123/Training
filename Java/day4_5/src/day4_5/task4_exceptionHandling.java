/*
 Write a program that attempts to divide by 0, catches the Arithmetic Exception and provides a custom error message.
 */

package day4_5;

public class task4_exceptionHandling {

	public static void main(String[] args) {
		try {
			int result = 10/0;
			System.out.println("Result : "+result);
		}catch(ArithmeticException e) {
			System.out.println("Error: Division by 0 is not allowed");
		}

	}

}
