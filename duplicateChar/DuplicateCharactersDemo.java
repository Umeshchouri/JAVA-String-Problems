package com.kn.duplicateChar;

import java.util.Scanner;

public class DuplicateCharactersDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scan.nextLine();
		char[] charArray=str.toCharArray();
		
		DuplicateCharacter duplicateCharacter=new DuplicateCharacter();
		duplicateCharacter.duplicatecharacters(charArray);
		scan.close();
	}
	

}
