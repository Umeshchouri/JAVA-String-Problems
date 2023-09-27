package com.kn.ReplaceString;

import java.util.Scanner;

public class ReplaceStringDemo {

	public static void main(String[] args) {
		// take input from the user end
		Scanner scan = new Scanner(System.in);

		// create the string
		System.out.println("enter the string");
		String input = scan.nextLine();

		// create the object for the class ReplaceString
		ReplaceString replaceString = new ReplaceString();
		String result = replaceString.repaceTheString(input);

		// create the object for the method replaceStringWithoutUsingCharArray:
		String result1 = replaceString.replaceStringWithoutUsingCharArray(input);

		System.out.println(result);
		System.out.println(result1);
		
		//releasing the resources:
		scan.close();

	}

}
