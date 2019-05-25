package com.algo.sort.heapsort;

import org.junit.Test;

public class HeapSortTest {
	
	@Test
	public void heapify() {
		int array[] = {12, 11, 13, 5, 6, 7};
		HeapSort heapSort = new HeapSort();
		heapSort.sort(array);
		heapSort.printArray(array);
		
	}

}
