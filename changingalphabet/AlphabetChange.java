package com.kn.changingalphabet;

public class AlphabetChange {

	public void changingAlpabet(String input) {
		char[] charArray=input.toCharArray();
		
		for(int i=0;i<charArray.length;i++)
		{
			if(charArray[i]>=65 && charArray[i]<=90)
			{
				charArray[i]=(char)(charArray[i]+32);
			}
			else if(charArray[i]>=97 && charArray[i]<=122)
			{
				charArray[i]=(char)(charArray[i]-32);
			}
		}
		StringBuffer output=new StringBuffer();
		for(char c:charArray)
		{
			output.append(c);
		}
		System.out.println(output);
	
		
	}

}
