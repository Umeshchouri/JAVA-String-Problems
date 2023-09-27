package com.kn.palindrom;

import java.util.Scanner;

public class PalindromDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String input=scan.next();
		
		//creating object for the Palindrome
		Palindrome palindrome=new Palindrome();
		boolean res=palindrome.isPalindromeCheck(input);
		
		if(res)
		{
			System.out.println("Enterd string is palindrome that is "+input);
		}
		else
		{
			System.out.println("Enterd string is non palindrome.");
		}
		
		scan.close();
		
	}

}
