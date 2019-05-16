package com.ds.stack;

import java.util.Arrays;

public class SStack<E> {
	
	private int initialCapacity = 5;
	private Object store[] = new Object[initialCapacity];
	private int top = -1;
	
	public void push(E item) {
		if (top == store.length - 1) {
			resize();
			top = top + 1;
			store[top] = item;
		} else {
			top = top + 1;
			store[top] = item;
		}		
	}
	@SuppressWarnings("unchecked")
	public E peek() {
		if(top == -1) {
			throw new RuntimeException("Stack is empty");			
		}else {
			return (E)store[top];
		}	
	}
	@SuppressWarnings("unchecked")
	public E pop() {
		if(top == -1) {
			throw new RuntimeException("Stack is empty");			
		}else {
			E item = (E) store[top];
			top = top -1;
			return item;
		}	
	}
	
	private void resize() {
		int newCapacity = initialCapacity*2;
		Object newStore[] = Arrays.copyOf(store, newCapacity);
		store = newStore;
	}
	
	public void print() {
		for (int i = 0; i < store.length; i++) {
			System.out.print(i);
		}
	}

}
