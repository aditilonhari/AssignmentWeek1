/*
Problem Statement: Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
*/
public class Solution {
	public int isPalindrome(String a) {
	    
	    if(a == null || a.isEmpty())
	        return 0;
	    
	    a = a.toLowerCase();
	    
	    int size = a.length(); 
	    int l = 0;
	    int r = size - 1;
	    
	    boolean palindromePresent = true;
	    while(l<r){
	        
	        
	        while((l<=size-1) && (a.charAt(l) == ' ' || !Character.isLetterOrDigit(a.charAt(l)))){
	            l++;
	        }
	        
	        while(( r >= 0) && (a.charAt(r) == ' ' || !Character.isLetterOrDigit(a.charAt(r)))){
	            r--;
	        }

	        if((l > size-1) || (r < 0)){
	            break;
	        }
	        

	        if(a.charAt(l) != a.charAt(r)){
	            palindromePresent = false;
	            break;
	        }
	        l++;
	        r--;
	    }
	    
	    if(!palindromePresent){
	        return 0;
	    }
	    
	    return 1;
	}
}
