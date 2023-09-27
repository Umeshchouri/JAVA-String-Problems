package com.kn.stringwordreverse;

public class StringWordsReversing {

	public void wordsReverse(String inputString) {
		String[] input=inputString.split(" ");
	    for(int i=0;i<input.length;i++)
	    {
	    	char[] reverseword=input[i].toCharArray();
	    	for(int j=reverseword.length-1;j>=0;j--)
	    	{
	    		System.out.print(reverseword[j]);
	    	}
	    	System.out.print(" ");
		
		}
		
	}

}
