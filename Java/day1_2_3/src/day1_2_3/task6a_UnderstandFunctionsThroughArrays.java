/*
 Write a recursive function named SumArray and calculates and return sum of elements in an array, demonstrate with an example
 */

package day1_2_3;

import java.util.Scanner;

public class task6a_UnderstandFunctionsThroughArrays {

	public static void main(String[] args) {
		/*
		 Demonstration:
		 size: 5
		 arr = [1,2,3,4,5]
		 sum = sumArray(arr,5)
		 output => 15
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of Array");
		for(int i=0; i<n; i++)
		{
			arr[i]  = sc.nextInt();
		}
		int sum = SumArray(arr, n);
		System.out.println("Sum of Array is : "+sum);
		sc.close();

	}
	public static int SumArray(int[] arr, int n)
	{
		if(n<=0) return 0;
		return arr[n-1] + SumArray(arr,n-1);
	}

}
