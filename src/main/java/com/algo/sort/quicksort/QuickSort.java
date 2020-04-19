package com.algo.sort.quicksort;

public class QuickSort {

	public static void main(String[] args) {
		int array[] = new int[] {9,10,12,2,3,4,5,6,1,22,98,-10};
		QuickSort quickSort = new QuickSort();
		quickSort.sort(array, 0, array.length - 1);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}

	private void sort(int array[], int low, int high) {
		if (high <= low)
			return;
		int j = partition(array, low, high);
		sort(array, low, j - 1);
		sort(array, j + 1, high);
	}

	public int partition(int array[], int low, int high) {
		int i = low;
		int j= high+1;
		int pivot = array[low];
		while(true) {
			while(array[++i]<pivot) if(i == high)break;
			while(array[--j]>pivot) if (j == low)break;
			if(i>=j)break;
			int tmp = array[i];
			array[i] = array[j];
			array[j]= tmp;
		}
		int tmp = array[low];
		array[low] = array[j];
		array[j]= tmp;
		return j;
	}

}
