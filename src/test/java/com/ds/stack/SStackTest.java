package com.ds.stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SStackTest {
	
	@Test
	public void push() {
		SStack<Integer> sStack = new SStack<Integer>();
		sStack.push(10);
		sStack.push(11);
		sStack.push(12);
		assertEquals(new Integer(12), sStack.peek());
		assertEquals(new Integer(12), sStack.pop());
		assertEquals(new Integer(11), sStack.peek());
	}

}
