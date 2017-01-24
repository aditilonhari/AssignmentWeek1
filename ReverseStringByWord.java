/*
Problem Statement: Given an input string, reverse the string word by word.
*/
public class Solution {
	public String reverseWords(String a) {
	    
	    if(a == null || a.isEmpty())
	        return a;
	        
	    char[] a_array = a.toCharArray();
	    int size = a.length();
	    int l = 0;
	    int r = size -1;
	    
	    reverseHelper(a_array,l,r);
	    
	    int start = -1;
	    int end = -1;
	    
	    for(int i=0; i<size; i++){
	        
	        if((a_array[i] == ' ' || i == size-1 ) && (start != -1)){
	            if(i == size -1)
	                end = i;
	            else
	                end = i-1;
	                
	            reverseHelper(a_array, start, end);
	            start = -1;
	            end = -1;
	        }
	        else if(a_array[i] != ' ' && start == -1){
	            start = i;
	        }
	    }
	    
	    
	    String str = Arrays.toString(a_array)
	                    .replace(", ", "")  //remove the commas
                        .replace("[ ", "")  //remove the right bracket
                        .replace("] ", "")  //remove the left bracket
                        .replace("[", "")  //remove the right bracket
                        .replace("]", "")  //remove the left bracket
                        .replaceAll(" +", " ") // removes multiple spaces 
                        .trim(); // trim both end white spaces
                        
	    return str;
	}
	
	public void reverseHelper(char[] array, int l, int r){
	    
	    while(l <= r){
	         char temp = array[l];
	         array[l] = array[r];
	         array[r] = temp;
	         
	         l++;
	         r--;
	    }
	}
}
