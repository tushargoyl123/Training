/*
 Write a method that takes 2 strings, concatenates them, reverses the result, and then extract the middle substring of given length. Ensure your method handles edge cases, such as an empty string or the substring length greater than the concatenated string. 
 */

package day1_2_3;

import java.util.Scanner;

public class task9_StringOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 Strings to extract the middle string");
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println("Enter the length of middle string to be extracted");
		int length = sc.nextInt();
		String middleString = ExtractMiddleString(s1, s2, length);
		System.out.println("The output string is : "+middleString);
		sc.close();

	}
	
	public static String ConcatenateString(String s1, String s2) {
		String concatenated = s1+s2;
		System.out.println("The concatenated string is : "+concatenated);
		return concatenated;
	}
	
	public static String ReverseString(String str) {
		String reverse = "";
		char ch;
		for(int i=0; i<str.length(); i++)
		{
			ch = str.charAt(i);
			reverse = ch+reverse;
		}
		System.out.println("The reversed string is "+reverse);
		return reverse;
	}
	
	public static String ExtractMiddleString(String s1, String s2, int length) {
		String concatenated = ConcatenateString(s1, s2);
		String reverse = ReverseString(concatenated);
		int middleidx = reverse.length()/2;
		int startidx = middleidx - length/2;
		if(startidx<0 || length>concatenated.length()) return concatenated;
		String middleString = "";
		for(int i=startidx; i<startidx+length; i++) {
			middleString+=reverse.charAt(i);
		}
		return middleString;
	}

}
