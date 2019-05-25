package com.algo.sort.heapsort;

public class HeapSort {
	
	public void sort(int array[]) {
		int n = array.length;
		buildHeap(array);
		for (int i = n - 1; i >= 0; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;

			heapify(array, 0, i);
		}
	}
	
	public void buildHeap(int array[]) {
		int midItem = array.length ;
		for(int i = midItem/2 -1 ;i>=0;--i) {
			heapify(array, i, array.length);			
		}
		
	}
	private void heapify(int array[],int index,int size) {
		int largest = index;
		int leftIndex = 2*index+1;
		int rightIndex = 2*index+2;
		if(leftIndex<size && array[leftIndex]>array[largest]) {
			largest =  leftIndex;
		}
		if(rightIndex<size && array[rightIndex]>array[largest]) {
			largest =  rightIndex;
		}
		if(largest != index) {
			int temp = array[index];
			array[index] = array[largest];
			array[largest] = temp;
			heapify(array, largest, size);
		}
		
	}

	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
		System.out.print(arr[i] + " ");
		System.out.println();
	}

}
