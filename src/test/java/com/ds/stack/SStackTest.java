package com.ds.stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SStackTest {
	
	@Test
	public void push() {
		SStack sStack = new SStack();
		sStack.push(10);
		sStack.push(11);
		sStack.push(12);
		assertEquals(12, sStack.peek());
		assertEquals(12, sStack.pop());
		assertEquals(11, sStack.peek());
	}

}
