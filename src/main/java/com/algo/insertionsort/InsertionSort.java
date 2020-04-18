package com.algo.insertionsort;

public class InsertionSort {

	public static void main(String[] args) {
		int array[] = new int[] {9,7,8,2,3,4,5,6,1,0,98};
		
		for(int i=1;i<array.length;++i) {
			int value = array[i];
			int j = i;
			while(j>=1 && array[j-1]>value) {
				array[j] = array[j-1];
				j = j-1;
			}
			array[j]= value;
			
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"\t");
		}

	}

}
