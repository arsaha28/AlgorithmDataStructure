package com.algo.sort.merge;

public class MergeSort {

	public static void main(String[] args) {
		int array[] = new int[] {9,7,8,2,3,4,5,6,1,0};
		MergeSort mergeSort = new MergeSort();
		int sortedArray[] = mergeSort.sort(array, 0, array.length-1);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i]);
		}

	}
	
	public  int[] sort(int array[],int low,int high) {
		if(!(low>=high)) {
			int middle = low+(high - low)/2;
			int firstArray[] = sort(array ,low,middle);
			int secondArray[] = sort(array,middle+1,high);
			int mergedArray[] = merge(firstArray,secondArray,low,middle,high);
			return mergedArray;
		}
		return array;
		
	}
	//Create two array by copying the elements
	public int[] merge(int firstArray[],int secondArray[],int low,int middle,int high) {
		int mergedArray[] = new int[high];
		int i = low,j = middle+1,k = 0;;
		while(i<middle || j<high) {
			if(firstArray[i]>secondArray[j]) {
				mergedArray[k]=firstArray[i];
				k++;
				i++;
			}else if(firstArray[i]<secondArray[j]) {
				mergedArray[k]=secondArray[j];
				k++;
				j++;
			}else if(firstArray[i]==secondArray[j]) {
				mergedArray[k]=secondArray[j];
				k++;
				j++;
			}
		}
		for(int x=i ;x<middle;++x) {
			mergedArray[k] = firstArray[x];
			k++;
		}
		for(int x=i ;x<high;++x) {
			mergedArray[k] = secondArray[x];
			k++;
		}
		return mergedArray;
	}

}
