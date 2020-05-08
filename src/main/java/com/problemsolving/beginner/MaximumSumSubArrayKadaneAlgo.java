package com.problemsolving.beginner;

public class MaximumSumSubArrayKadaneAlgo {

	public static void main(String[] args) {
		int input[] = new int[] {10,2,3,-1,4,2,-90,1};
		int sumSoFar = 0;
		int maxSoFar = 0;
		for(int i = 0;i<input.length;++i) {
			sumSoFar = sumSoFar+input[i];
			if(sumSoFar>maxSoFar) {
				maxSoFar = sumSoFar;
			}else if (sumSoFar<maxSoFar) {
				sumSoFar = 0;
			}
		}
		System.out.println(maxSoFar);

	}

}
