package com.kn.checkCharCases;

import java.util.Scanner;

public class CheckCasesOfStringDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String str=scan.nextLine();
		
		CheckCasesOfString checkCases=new CheckCasesOfString();
		checkCases.checkCasesString(str);
		
		scan.close();
	}

}
