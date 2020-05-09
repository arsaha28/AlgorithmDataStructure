package com.algo.kmp;

public class LPSArrayProducer {

	public int[] getLPSArray(String input) {
		int lpsArray[] = new int[input.length()];
		int i = 0;
		lpsArray[0] = 0;
		int j = 1;
		while (j < input.length()) {
			if (input.charAt(i) == input.charAt(j)) {
				lpsArray[j] = i + 1;
				i = i + 1;
				j = j + 1;

			} else if (i == 0 && input.charAt(i) != input.charAt(j)) {
				lpsArray[j] = 0;
				j = j + 1;
			} else if (i != 0 && input.charAt(i) != input.charAt(j)) {
				i = lpsArray[i - 1];

			}
		}
		return lpsArray;
	}
}
