package com.kn.FirstNonReapeatingChar;

import java.util.Scanner;

public class FirstNonReapeatingCharDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string1");
		String input=scan.nextLine();
		FirstNonReapeatingChar nonRepeat=new FirstNonReapeatingChar();
		nonRepeat.firstNonRepeating(input);
		
		scan.close();
	}

}
