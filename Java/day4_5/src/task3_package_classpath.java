/*
 create a package com.math.operations and include classes for various arithmetic operations. Demonstrate how to compile and run these using classpath.
 */

import java.util.Scanner;

public class task3_package_classpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Performing Arithmetic operations");
		double resultAdd = com.math.operations.Additon.add(a, b);
		double resultSub = com.math.operations.Substraction.substract(a, b);
		double resultMul = com.math.operations.Multiplication.multiply(a, b);
		double resultDiv = com.math.operations.Division.divide(a, b);
		System.out.println("Result of addition : "+resultAdd);
		System.out.println("Result of multiplication : "+resultMul);
		System.out.println("Result of substraction : "+resultSub);
		System.out.println("Result of division : "+resultDiv);
		sc.close();
		

	}

}
