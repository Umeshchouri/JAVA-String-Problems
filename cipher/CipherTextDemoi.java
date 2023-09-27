package com.kn.cipher;

import java.util.Scanner;

public class CipherTextDemoi {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n=scan.nextInt();
		System.out.println("Enter the string");
		scan.nextLine();
		String input=scan.nextLine();
		
		CipherText ciper=new CipherText();
		ciper.cipherText(n,input);
		
		scan.close();
	}

}
