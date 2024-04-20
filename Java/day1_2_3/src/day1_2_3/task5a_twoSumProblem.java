/*
 Given an array of integers, write a program that finds if there are 2 numbers that add up to a specific target. You may assume that each input would have exactly 1 solution, and you may not use the same element twice. Optimize the solution for time complexity.
 */

package day1_2_3;

import java.util.Scanner;

public class task5a_twoSumProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of Array");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the target number");
		int target = sc.nextInt();
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		int left = 0;
		int right = n-1;
		while(left<right) {
			int sum = arr[left]+arr[right];
			if(sum==target) break;
			else if(sum<target) left++;
			else right--;
		}
		if(left==right) System.out.println("target "+target+" not found");
		else {
			System.out.println("target "+target+" is found by sum with values: "+arr[left]+" and  "+arr[right]);
		}
		sc.close();
	}

}
