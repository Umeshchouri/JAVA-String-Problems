package com.kn.repeatingcharcount;

public class RepeatingCharCount {

	public char[] sorting(String str) {
		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < charArray.length - 1; j++) {
				if (charArray[j] > charArray[j + 1]) {
					char temp = charArray[j];
					charArray[j] = charArray[j + 1];
					charArray[j + 1] = temp;

				}

			}
		}
		return charArray;

	}

	public void countRepeatingChar(char[] arr) {
		int count = 1;

		for (int i = 0; i < arr.length - 1; i++) {
			if (i + 1 == arr.length - 1) {

				if (arr[i] == arr[i + 1]) {
					count++;
					System.out.println(arr[i] + "=" + count);

				} else {
					System.out.println(arr[i + 1] + "=" + 1);
				}
			}

			if (arr[i] == arr[i + 1]) {
				count++;
			}

			else {
	
				System.out.println(arr[i] + "=" + count);
				count = 1;

			}

			
		}

	}
}
