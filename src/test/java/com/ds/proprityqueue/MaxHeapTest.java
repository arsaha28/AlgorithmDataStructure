package com.ds.proprityqueue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ds.priorityqueue.MaxHeap;

public class MaxHeapTest {
	
	@Test
	public void insert() {
		MaxHeap maxHeap = new MaxHeap(10);
		maxHeap.insert(20);
		maxHeap.insert(10);
		maxHeap.insert(5);
		maxHeap.insert(25);
		int item = maxHeap.delete();
		assertEquals(25, item);
		
	}

}
