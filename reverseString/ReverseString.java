package com.kn.reverseString;



public class ReverseString {

	public String reverseTheString(String inputString) 
	{
		StringBuffer outputString=new StringBuffer();
		
		for(int i=inputString.length()-1;i>=0;i--)
		{
			outputString.append(inputString.charAt(i));
		}
		return outputString.toString();
		
		
	}

	public String reverserstringUsingArray(String inputString) {
		char[] charArray=inputString.toCharArray();
		String reverse="";
		for(int i=charArray.length-1;i>=0;i--)
		{
			reverse+=charArray[i];
			
		}
		
		return reverse;
		
		
		
	}

}
