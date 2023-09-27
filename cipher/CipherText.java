package com.kn.cipher;

public class CipherText {

	public void cipherText(int n, String input) {
		char[] arr=input.toCharArray();
		
		while(n>26)
		{
			n-=26;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=65 && arr[i]<=90-n || arr[i]>=97&& arr[i]<=122-n)
			{
				arr[i]=(char)(arr[i]+n);
				System.out.print(arr[i]+" ");	
			}
		else
		{
			
			arr[i]=(char)(arr[i]-26);
			arr[i]=(char)(arr[i]+n);
			System.out.print(arr[i]+" ");
		}
		}
		
	}

}
