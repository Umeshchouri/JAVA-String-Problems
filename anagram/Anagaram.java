package com.kn.anagram;

public class Anagaram {
	
	public char[] sortingCharArray(char[] charArray) {
	
	for(int i=0;i<charArray.length;i++)
	{
		for(int j=0;j<charArray.length-1;j++)
		{
			if(charArray[j]>charArray[j+1])
			{
				char temp=charArray[j];
				charArray[j]=charArray[j+1];
				charArray[j+1]=temp;
				
			}
			
		}
	}
	return charArray;
	
	}

	public boolean isAnagram(char[] output1, char[] output2) {
		boolean isAnagram=false;
		if(output1.length!=output2.length)
		{
		 return isAnagram;
		}
		
		for(int i=0;i<output1.length;i++)
		{
				if(output1[i]==output2[i])
				{
				isAnagram=true;
				}
				else
				{
					isAnagram=false;
					break;
				}
		}
		return isAnagram;
	}
}
