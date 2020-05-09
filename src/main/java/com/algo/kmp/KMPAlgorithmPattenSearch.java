package com.algo.kmp;

public class KMPAlgorithmPattenSearch {

	public static void main(String[] args) {
		String txt = "ABABDABACDABABCABAB"; 
        String pattern = "ABABCABAB"; 
        KMPAlgorithmPattenSearch kmp = new KMPAlgorithmPattenSearch();
        kmp.search(pattern,txt);
       
	}
	
	
    void search(String pattern, String txt) {
    	int patternLength = pattern.length(); 
        int textLength = txt.length();
        LPSArrayProducer arrayProducer = new LPSArrayProducer();
        int lps[] = arrayProducer.getLPSArray(txt);
        int textIndex = 0;  
        int patternIndex = 0; 
        while (textIndex < textLength) { 
            if (pattern.charAt(patternIndex) == txt.charAt(textIndex)) { 
                patternIndex++; 
                textIndex++; 
            } 
            if (patternIndex == patternLength) { 
            	System.out.println("Found pattern " + "at index " + (textIndex - patternIndex)); 
                patternIndex = lps[patternIndex - 1]; 
            } 
            else if (textIndex < textLength && pattern.charAt(patternIndex) != txt.charAt(textIndex)) { 
                if (patternIndex != 0) 
                    patternIndex = lps[patternIndex - 1]; 
                else
                    textIndex = textIndex + 1; 
            } 
        } 

    }
    
}
