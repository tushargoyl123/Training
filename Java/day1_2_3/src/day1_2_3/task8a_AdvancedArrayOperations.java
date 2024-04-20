/*
 Implement a method SliceArray that takes an Array, a starting index and an end index, then returns a new array containing the elements from start to the end index.
 */

package day1_2_3;

import java.util.Scanner;

public class task8a_AdvancedArrayOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of Array");
		for(int i=0; i<n; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Enter start and end values for slicing Array");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int result[] = SliceArray(arr, start, end);
		System.out.println("Original Array");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Sliced Array");
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+" ");
		}
		sc.close();

	}
	public static int[] SliceArray(int[] arr, int start, int end) {
		if(start<0 || start>=arr.length || end<start || end>arr.length) {
			throw new IllegalArgumentException();
		}
		int length = end-start;
		int result[] = new int[length];
		for(int i=0; i<length; i++) {
			result[i] = arr[start+i];
		}
		return result;
	}

}
