/*
 Create a shape class with a method area() and extend it with circle and rectangle classes overriding the area() method properly.
 */

package day4_5;

import java.util.Scanner;

public class task2_Inheritance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lets calculate area of circle");
		System.out.println("Enter radius of circle");
		double radius = sc.nextDouble();
		Circle c1 = new Circle(radius);
		double cArea = c1.area();
		System.out.println("Area of circle = "+cArea);
		System.out.println("Lets calculate area of rectangle");
		System.out.println("Enter height and width of rectangle");
		double height = sc.nextDouble();
		double width = sc.nextDouble();
		Rectangle r1 = new Rectangle(height,width);
		double rArea = r1.area();
		System.out.println("Area of rectangle = "+rArea);
		sc.close();

	}
	

}

class Shape{
	public double area() {
		return 0;
	}
}
class Circle extends Shape{
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double area() {
		return Math.PI*radius*radius;
	}
}
class Rectangle extends Shape{
	private double height;
	private double width;
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	public double area() {
		return height*width;
	}
}
