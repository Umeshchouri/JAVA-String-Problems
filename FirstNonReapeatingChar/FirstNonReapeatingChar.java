package com.kn.FirstNonReapeatingChar;


public class FirstNonReapeatingChar {

	public void firstNonRepeating(String input) {
		char[] arr=input.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			boolean isRepeated=false;
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j&&arr[i]==arr[j])
				{
					isRepeated=true;
					//break;
				}
			}
			if(!isRepeated)
			{
				System.out.println("The first nonrepeating char is = "+arr[i]);
				break;
			}
		}
	}
	

}
