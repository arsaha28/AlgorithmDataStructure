package com.problemsolving.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringPalindromeTest {
	
	@Test
	public void isPalindrom_1() {
		String input = "ABA";
		StringPalindrome palindrome = new StringPalindrome();
		assertEquals(true, palindrome.isPalindrome(input));

	}
	@Test
	public void isPalindrom_2() {
		String input = "ABAC";
		StringPalindrome palindrome = new StringPalindrome();
		assertEquals(false, palindrome.isPalindrome(input));

	}
	@Test
	public void isPalindrom_3() {
		String input = null;
		StringPalindrome palindrome = new StringPalindrome();
		assertEquals(false, palindrome.isPalindrome(input));

	}
	@Test
	public void isPalindrom_4() {
		String input = "A";
		StringPalindrome palindrome = new StringPalindrome();
		assertEquals(true, palindrome.isPalindrome(input));

	}

}
