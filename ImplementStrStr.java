/*
Problem Statement:  strstr - locate a substring ( needle ) in a string ( haystack ). 
		    Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
		    (Try not to use standard library string functions for this question)
*/
public class Solution {
	public int strStr(final String haystack, final String needle) {
	    
	    if(needle == null || haystack == null)
	        return -1;
	        
	    if(needle.isEmpty() || haystack.isEmpty())
	        return -1;
	        
	    if(haystack.equals(needle)){
	        return 0;
	    }     
	        
	    int h_size = haystack.length();
	    int n_size = needle.length();
	    
	    for(int i=0; i < h_size - n_size; i++){
	        String h_substr = haystack.substring(i, i+n_size);
	        if(h_substr.equals(needle)){
	            return i;
	        }
	    }
	    
	    return -1;
	}
}
