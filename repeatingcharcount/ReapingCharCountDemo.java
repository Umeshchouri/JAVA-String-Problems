package com.kn.repeatingcharcount;

import java.util.Scanner;

public class ReapingCharCountDemo {
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String str=scan.nextLine();
		
		//object for the RepeatingCharCount
	
		RepeatingCharCount repeatingCharCount=new RepeatingCharCount();
		char[] arr=repeatingCharCount.sorting(str);
		
		//sorted array:
		System.out.println("The sorted array is");
		for(char c:arr)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		
		//calling a method for the countRepeatingcharCount:
		repeatingCharCount.countRepeatingChar(arr);
	}

}
