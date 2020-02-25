package com.algo.permutation;

public class PrintPermutation {

	public static void main(String[] args) {
		String s = "ABC";
		int n = s.length();
		PrintPermutation permutation = new PrintPermutation();
		permutation.calculate(s, 0, n - 1);
	}

	private void calculate(String str, int left, int right) {
		if (left == right) {
			System.out.println(str);
		} else {
			for (int i = left; i <= right; ++i) {
				String swapped = this.swap(str, left, i);
				calculate(swapped, left + 1, right);
			}
		}
	}

	private String swap(String str, int i, int j) {
		char temp;
		char charArray[] = str.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
