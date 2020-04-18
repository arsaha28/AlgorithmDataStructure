package com.algo.selectionsort;

public class SelectionSort {

	public static void main(String[] args) {
		int array[] = new int[] {9,7,8,2,3,4,5,6,1,0};
		for(int i= 0;i<array.length;++i) {
			int min = i;
			for(int j =i+1;j<array.length;++j ) {
				if(array[j]< array[min]){
					min = j;
				}
			}
			int tmp = array[i];
			array[i] = array[min];
			array[min] = tmp;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"\t");
		}

	}

}
