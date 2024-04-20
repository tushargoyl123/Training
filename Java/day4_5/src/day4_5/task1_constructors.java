/*
 Implement a Matrix class that has a constructor which initializes the dimentions of a matrix and a method to fill the matrix with values.
 */

package day4_5;

import java.util.Scanner;

public class task1_constructors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and columns of matrix");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int arr[][] = new int[rows][cols];
		System.out.println("Enter the elements of matrix to be inserted");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		Matrix m1 = new Matrix(rows,cols);
		m1.fillMatrix(arr);
		System.out.println("Matrix: ");
		m1.printMatrix();
		sc.close();

	}

}

class Matrix{
	private int[][] matrix;
	public Matrix(int rows, int cols) {
		matrix = new int[rows][cols];
	}
	public void fillMatrix(int[][] arr) {
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++) {
				matrix[i][j] = arr[i][j];
			}
		}
	}
	public void printMatrix() {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
