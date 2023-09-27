package com.kn.stringwordreverse;

import java.util.Scanner;

public class StringWordsReversingDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string1");
		String inputString=scan.nextLine();
		
		StringWordsReversing stringWordReversing=new StringWordsReversing();
		stringWordReversing.wordsReverse(inputString);
	
		scan.close();
	}

}
