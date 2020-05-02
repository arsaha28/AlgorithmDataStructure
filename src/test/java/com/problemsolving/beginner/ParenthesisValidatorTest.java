package com.problemsolving.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ParenthesisValidatorTest {
	
	@Test
	public void isValidParenthesis_1() {
		String input = "[{(a*b)+c}*d]/x";
		ParenthesisValidator parenthesisValidator = new ParenthesisValidator();
		assertEquals(true, parenthesisValidator.isBalancedParenthesis(input));

	}
	
	@Test
	public void isValidParenthesis_2() {
		String input = "[{(a*b)+c}*d/x";
		ParenthesisValidator parenthesisValidator = new ParenthesisValidator();
		assertEquals(false, parenthesisValidator.isBalancedParenthesis(input));

	}
	@Test
	public void isValidParenthesis_3() {
		String input = "[]";
		ParenthesisValidator parenthesisValidator = new ParenthesisValidator();
		assertEquals(true, parenthesisValidator.isBalancedParenthesis(input));

	}

}
