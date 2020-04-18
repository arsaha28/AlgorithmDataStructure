package com.algo.sort.merge;

public class MergeSort {

	public static void main(String[] args) {
		int array[] = new int[] { 9, 7, 8, 2};
		int arrayAux[] = new int[array.length];
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(array, arrayAux,0, array.length - 1);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

	}

	public void sort(int array[],int arrayAux[], int low, int high) {
		if (low >= high)
			return;
		int middle = low + (high - low)/ 2;
		sort(array,arrayAux, low, middle);
		sort(array,arrayAux, middle + 1, high);
		merge(array, arrayAux,low, middle, high);

	}

	
	public void merge(int array[],int arrayAux[],int low, int middle, int high) {
		int i = low;
		int j = middle +1;
		for(int k = low;k<=high;k++) {
			arrayAux[k]=array[k];
		}
		for(int k= low;k<=high;++k) {
			if(i>middle) array[k] = arrayAux[j++];
			else if(j>high) array[k] = arrayAux[i++];
			else if(arrayAux[j]<arrayAux[i]) array[k] = arrayAux[j++];
			else array[k] = arrayAux[i++];
			
		}
	
	}

}
