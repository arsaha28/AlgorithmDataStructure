package com.problemsolving.beginner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ParenthesisValidator {
	
	public boolean isBalancedParenthesis(String input) {
		Stack<Character> stack = new Stack<Character>();
		List<Character> openningAllowedList =  Arrays.asList('[','{','(');
		List<Character> closingAllowedList =  Arrays.asList(']','}',')');
		Map<Character,Character> bracesMatch = new HashMap<Character,Character>();
		bracesMatch.put('[', ']');
		bracesMatch.put('{', '}');
		bracesMatch.put('(', ')');
		for(int i= 0;i<input.length();++i) {
			if(openningAllowedList.contains(input.charAt(i))){
				stack.push(input.charAt(i));
			}else if(closingAllowedList.contains(input.charAt(i))) {
				Character charac = stack.peek();
				if(!bracesMatch.get(charac).equals(input.charAt(i))) {
					return false;
				}else {
					stack.pop();
				}
			}
		}
		if(stack.isEmpty()) {
			return true;
		}else {
			return false;
		}
		
	}

}
