/*
 Implement a function called BruteForceSort that sort an array using Brute Force Approach. Use this function to sort Array created with InitializeArray
 */

package day1_2_3;

import java.util.Scanner;

public class task7a_ArraySortingAndSearching {

	public static void main(String[] args) {
		int arr[] = IntializeArray();
		int n = arr.length;
		System.out.println("Original array is: ");
		for(int i=0; i<n; i++) System.out.print(arr[i]+" ");
		System.out.println();
		BruteForceSort(arr, n);
		System.out.println("The sorted Array is: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] IntializeArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
		
	}
	public static void BruteForceSort(int[] arr, int n)
	{
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
