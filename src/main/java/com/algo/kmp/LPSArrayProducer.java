package com.algo.kmp;

public class LPSArrayProducer {

	public static void main(String[] args) {
		String input = "ABCDABD";
		int lpsArray[]= new int[input.length()];
		for(int k = 0;k<input.length();++k) {
			lpsArray[k]=-99;
		}
		int i = 0;
		
		lpsArray[0]= 0;
		int j=1;
		while(j<input.length()){
			if(input.charAt(i)==input.charAt(j)) {
				lpsArray[j]= i+1;
				i = i+1;
				j = j+1;
				
			}else if(i == 0 && input.charAt(i)!=input.charAt(j)){
				lpsArray[j] = 0;
				j = j+1;				
			}else if(i != 0 && input.charAt(i)!=input.charAt(j)){
				i =lpsArray[i-1]; 
				
			}
		}
		for(int k=0;k<lpsArray.length;++k) {
			System.out.print(lpsArray[k]+"\t");
		}
		}

	

}
