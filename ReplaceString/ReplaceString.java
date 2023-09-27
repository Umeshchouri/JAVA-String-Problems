
package com.kn.ReplaceString;

public class ReplaceString {

	//method for the repaceTheString:
	public String repaceTheString(String input) {
		char[] charString = input.toCharArray();
		StringBuffer output = new StringBuffer();
		for (int i = 0; i < charString.length; i++) {
			if (charString[i] == ' ') {
				charString[i] = '$';
			}

		}
		for (int i = 0; i < charString.length; i++) {
			output.append(charString[i]);
			
		}

		return output.toString();
	}

	//method for the replaceStringWithoutUsingCharArray
	public String replaceStringWithoutUsingCharArray(String input) {
		StringBuffer buffer = new StringBuffer(input);
		for (int i = 0; i < buffer.length(); i++) {
			if (buffer.charAt(i) == ' ') {
				buffer.setCharAt(i, '$');
			}
		}
		return buffer.toString();
	}

}
