package com.kn.firstRepeatingChar;

public class FirstRepeatingChar {

	public void firstRepeating(String input) {
		char[] arr=input.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			boolean isRepeating=false;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					isRepeating=true;
					break;
				}
			}
			if(isRepeating)
			{
				System.out.println("First repeating character is="+arr[i]);
				break;
			}
		}
		
	}

}
