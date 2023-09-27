package com.kn.checkCharCases;

public class CheckCasesOfString {

	public void checkCasesString(String str) {
		char[] arr=str.toCharArray();
		
		int upperVowel=0;
		int upperConsonat=0;
		int lowerVowel=0;
		int lowerConsonant=0;
		int digit=0;
		int space=0;
		int specialChar=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=97 && arr[i]<=122)
			{
				if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
				{
					lowerVowel++;
				}
				else
				{
					lowerConsonant++;
				}
			}
				else if(arr[i]>=65 && arr[i]<=90)
				{
					if(arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')
					{
						upperVowel++;
					}
					else
					{
						upperConsonat++;
					}
				}
				else if(arr[i]>=48 && arr[i]<=57)
				{
					digit++;
				}
				else if(arr[i]==32)
				{
					space++;
				}
				else
				{
					specialChar++;
				}
			
			}
		System.out.println("upperVowel="+upperVowel);
		System.out.println("upperConsonat"+upperConsonat);
		System.out.println("lowervowel:"+lowerVowel);
		System.out.println("lowerConsonant:"+lowerConsonant);
		System.out.println("Didgit: "+digit);
		System.out.println("space: "+space);
		System.out.println("special characters: "+specialChar);
		
		}
	}


