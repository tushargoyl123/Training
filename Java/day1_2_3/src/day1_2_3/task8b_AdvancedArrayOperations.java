/*
 Create a recursive function to find the nth element of a Fibonacci sequence and store the first n elements in an array.
 */

package day1_2_3;

import java.util.Scanner;

public class task8b_AdvancedArrayOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		int fibonacciArray[] = GenerateFibonacciArray(n);
		System.out.println("Fibonacci Array is: ");
		for(int i=0; i<n; i++) {
			System.out.print(fibonacciArray[i]+" ");
		}
		System.out.println();
		int nthElement = GetnthFibonacciRecursive(n-1);
		System.out.println("nth element calculated using recursion is: "+nthElement);
		sc.close();

	}
	public static int GetnthFibonacciRecursive(int n) {
		if(n==0 || n==1) return n;
		return GetnthFibonacciRecursive(n-1)+ GetnthFibonacciRecursive(n-2);
	}
	public static int[] GenerateFibonacciArray(int n) {
		int fibonacciArray[] = new int[n];
		for(int i=0; i<n; i++) {
			fibonacciArray[i] = GetnthFibonacciRecursive(i);
		}
		return fibonacciArray;
	}

}
