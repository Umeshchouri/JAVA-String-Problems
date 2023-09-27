package com.kn.firstRepeatingChar;

import java.util.Scanner;

public class FirstRepeatingCharDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String input=scan.nextLine();
		
		FirstRepeatingChar repeating=new FirstRepeatingChar();
		repeating.firstRepeating(input);
		
		scan.close();
		
	}

}
