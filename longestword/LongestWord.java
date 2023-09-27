package com.kn.longestword;

public class LongestWord {
	public String longestWordInString(String inputString) {
	
	String[] word=inputString.split(" ");
	
	for(String a:word)
	{
		System.out.print(a+" ");
	}
	
	String longestWord=word[0];
	for(int i=0;i<word.length;i++)
	{
		if(word[i].length()>longestWord.length())
		{
			longestWord=word[i];
		}
	}
	return longestWord;	
	}

}
