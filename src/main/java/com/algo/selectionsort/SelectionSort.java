package com.algo.selectionsort;

/*
 * Easy to implement
 * Best case complexity o(n2)
 * Worst case complexity o(n2)
 * Average case complexity o(n2)
 * 
 */
public class SelectionSort {

	public static void main(String[] args) {
		int array[] = new int[] {9,7,8,2,3,4,5,6,1,0,98};
		for(int i= 0;i<array.length;++i) {
			//Self-Note:Consider array[i] is the minimum element
			int min = i;
			for(int j =i+1;j<array.length;++j ) {
				//Self-Note:Keep looking for an element which is smaller than current smallest element.If one if find then point it as minimum.
				if(array[j]< array[min]){
					min = j;
				}
			}
			//Self-Note:Swap the array[i] with the minimum element
			int tmp = array[i];
			array[i] = array[min];
			array[min] = tmp;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"\t");
		}

	}

}
