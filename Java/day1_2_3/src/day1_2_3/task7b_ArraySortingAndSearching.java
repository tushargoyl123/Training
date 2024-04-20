/*
 Write a function named PerformLinearSearch that searches for a specific element in the array and returns the index of element if found or -1 if not found
 */

package day1_2_3;

import java.util.Scanner;

public class task7b_ArraySortingAndSearching {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the target value to be searched");
		int target = sc.nextInt();
		int idx = PerformLinearSearch(arr, n, target);
		if(idx==-1) System.out.println("Element target "+target+" not found");
		else System.out.println("Element target "+target+" is found at index "+idx);
		sc.close();
		
	}
	
	public static int PerformLinearSearch(int arr[], int n, int target) {
		for(int i=0; i<n; i++) {
			if(arr[i]==target) return i;
		}
		return -1;
	}

}
