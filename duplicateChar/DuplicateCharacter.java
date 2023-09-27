package com.kn.duplicateChar;

public class DuplicateCharacter {

	public void duplicatecharacters(char[] charArray) {
	
		for(int i=0;i<charArray.length;i++)
		{
			int count=1;
		
			for(int j=i+1;j<charArray.length;j++)
			{
				
				if(charArray[i]==charArray[j])
				{
					count++;
					
				}
			}
			if(count==1)
			{
				System.out.print(charArray[i]+" ");
			}
		}
		
	}

}
