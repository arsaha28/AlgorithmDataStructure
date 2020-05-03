package com.problemsolving.beginner;

public class PermutationOfString {

	public static void main(String[] args) {
		String input = "abc";
		int left = 0;
		int right = input.length() -1;
		PermutationOfString permutationOfString = new PermutationOfString();
		permutationOfString.permutation(input, left, right);

	}
	
	public void permutation(String input,int left,int right) {
		if(left == right) {
			System.out.println(input);
		}
		
		for(int i = left;i<=right;++i) {
			String swapped = swap(input, left, i);
 			permutation(swapped, left+1, right);
		}
		
	}
	public String swap(String input,int first,int second) {
		char charArray[] = input.toCharArray();
		char tmp = charArray[first];
		charArray[first] = charArray[second];
		charArray[second] = tmp;
		return String.valueOf(charArray);
	}

}
