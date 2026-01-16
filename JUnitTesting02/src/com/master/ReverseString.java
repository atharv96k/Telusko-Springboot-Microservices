package com.master;

public class ReverseString {
	
	public String reverseString(String string) { 
		char[] charArray = string.toCharArray();
		int left = 0;
		int right = charArray.length - 1;
		
			while (left < right) {
				char temp = charArray[left];
				charArray[left] = charArray[right];
				charArray[right] = temp;
				
				left++;
				right--;
			}
			return new String(charArray);
	}
}
