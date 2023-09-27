package com.kn.changingalphabet;

import java.util.Scanner;

public class AlphabetChangeDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String input=scan.nextLine();
		
		AlphabetChange alphabetChange=new AlphabetChange();
		alphabetChange.changingAlpabet(input);
		scan.close();
	}

}
