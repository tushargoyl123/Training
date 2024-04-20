/*
 Create a program that creates an array of integers, initializes it with consecutive numbers, and prints the array in reverse order.
 */

package day1_2_3;

import java.util.Scanner;

public class task4_Array_DeclarationInitalizationUsage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array you want to initialize");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = i+1;
		}
		System.out.println("Array in reverse order");
		for(int i=n-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
		

	}

}
