package com.kn.reverseString;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {
		//take input from the user
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String inputString=scan.nextLine();
		
		//creating a object for the class
		ReverseString reverseString=new ReverseString();
		String output=reverseString.reverseTheString(inputString);
		
		ReverseString reverseStringUsingArray=new ReverseString();
		String reverseArrayOutput=reverseStringUsingArray.reverserstringUsingArray(inputString);
		
		System.out.println("the reversed string is="+output);
		System.out.println("the reverseArrayOutput: "+reverseArrayOutput);
		
		//releasing resourse:
		scan.close();
		
		
	}

}
