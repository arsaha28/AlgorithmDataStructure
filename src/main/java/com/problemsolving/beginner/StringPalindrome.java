package com.problemsolving.beginner;

public class StringPalindrome {

	public boolean isPalindrome(String input) {
		if(input == null ) {
			return false;
		}
		int i = 0;
		int j = input.length()-1;
		while(i<j) {
			char firstChar = input.charAt(i);
			char lastChar = input.charAt(j);
			i = i+1;
			j = j-1;
			if(!(firstChar == lastChar)) {
				return false;
			}
		}
		return true;
	}
}
