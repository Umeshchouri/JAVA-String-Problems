
package com.kn.string1stwordchanging;

public class StringFisrtWord {

	public void firstWord(String input) {
		String[] arr=input.split(" ");
		StringBuffer output=new StringBuffer();
		
		for(int i=0;i<arr.length;i++)
		{
			char[] charArray=arr[i].toCharArray();
			for(int j=0;j<charArray.length;j++)
			{
				if(charArray[0]>=97 && charArray[0]<=122)
				{
					charArray[0]=(char)(charArray[0]-32);
				}
			}
		for(char c:charArray)
		{
		output.append(c);
		}
		output.append(" ");
		
	}
		System.out.println(output);
	}

}
