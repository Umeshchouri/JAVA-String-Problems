package com.kn.palindrom;

public class Palindrome {

	public boolean isPalindromeCheck(String input) {
		StringBuffer reverseString=new StringBuffer();
		
		for(int i=input.length()-1;i>=0;i--)
		{
			reverseString.append(input.charAt(i));
		}
		if(reverseString.toString().equals(input))
		{
			return true;
		}
		return false;
	}

}
