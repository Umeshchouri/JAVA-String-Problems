package com.kn.anagram;

public class AnagaramDemo {

	public static void main(String[] args) {
		String input="tab";
		String input1="bat";
		char[] charArray1=input.toCharArray();
		char[] charArray2=input1.toCharArray();
		
		
		Anagaram sorting=new Anagaram();
		char[] output1=sorting.sortingCharArray(charArray1);
		char[] output2=sorting.sortingCharArray(charArray2);
		boolean Anagram=sorting.isAnagram(output1,output2);
		
		if(Anagram)
		{
			System.out.println("Anagaram");
		}
		else
		{
			System.out.println("not an anagram");
		}

	}

}
