package com.kn.string1stwordchanging;

import java.util.Scanner;

public class StringFirstWordCapsDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string1");
		String input=scan.nextLine();
		
		StringFisrtWord stringFirstWord=new StringFisrtWord();
		stringFirstWord.firstWord(input);
		scan.close();
	}

}
