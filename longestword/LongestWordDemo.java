package com.kn.longestword;

import java.util.Scanner;

public class LongestWordDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string1");
		String inputString=scan.nextLine();
		
		LongestWord longestWord=new LongestWord();
		String output=longestWord.longestWordInString(inputString);
		System.out.println();
		System.out.println("the longest word is: "+output);
		scan.close();
	}

}
