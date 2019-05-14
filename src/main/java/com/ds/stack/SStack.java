package com.ds.stack;

public class SStack {
	
	private int store[] = new int[3];
	private int top = -1;
	
	public void push(int item) {
		if (top == store.length - 1) {
			throw new RuntimeException("Stack is full");
		} else {
			top = top + 1;
			store[top] = item;
		}		
	}
	
	public int peek() {
		if(top == -1) {
			throw new RuntimeException("Stack is empty");			
		}else {
			int item = store[top];
			return item;
		}	
	}
	public int pop() {
		if(top == -1) {
			throw new RuntimeException("Stack is empty");			
		}else {
			int item = store[top];
			top = top -1;
			return item;
		}	
	}
	
	public void print() {
		for (int i = 0; i < store.length; i++) {
			System.out.print(i);
		}
	}

}
