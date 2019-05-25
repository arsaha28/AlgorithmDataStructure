package com.ds.priorityqueue;

public class MaxHeap {
	
	private int []collection;
	private int size = 0; 
	
	public MaxHeap(int size) {
		collection = new int[size+1];
		collection[0]= Integer.MAX_VALUE;
	}
	
	private int parent(int position) {
		return position/2;
	}
	private int leftChild(int position) {
		return position*2;
	}
	private int rightChild(int position) {
		return (position*2)+1;
	}
	
	public void insert(int element) {
		size = size+1;
		collection[size] = element;
		int currentPosition = size;
		while(collection[currentPosition]>collection[parent(currentPosition)]) {
			swap(currentPosition, parent(currentPosition));
			currentPosition = parent(currentPosition);
		}
	}
	
	private void swap(int firstPosition,int secondPosition) {
		int tmp;
		tmp =  collection[firstPosition];
		collection[firstPosition]= collection[secondPosition];
		collection[secondPosition] = tmp;
	}
	
	public int delete() {
		int deletedItem = collection[1];
		collection[1] = collection[size];
		collection[size] = 0;
		size = size -1;
		maxHeapify(1);
		return deletedItem;
	}
	private void maxHeapify(int position) {
		if(collection[position]<collection[leftChild(position)] || collection[position]<collection[rightChild(position)] ) {
			if(collection[leftChild(position)]>collection[rightChild(position)]) {
				swap(position, leftChild(position));
				maxHeapify(leftChild(position));
			}else {
				swap(position, rightChild(position));
				maxHeapify(rightChild(position));
			}
		}
	}
}
