/*
Problem Statement : Given an unsorted integer array, find the first missing positive integer.
*/

public class Solution {
	public int firstMissingPositive(ArrayList<Integer> a) {
	    
	    if(a == null || a.size() == 0)
	        return -1;
	        
	    int max = Integer.MIN_VALUE;
	    for(int i=0; i<a.size(); i++){
	        int temp = a.get(i);
	        
	        if (temp > max){
	            max = temp;
	        }
	    }
	    
	    if(max <= 0)
	        return 1;
	    
	    int min = 1;
	    boolean[] values = new boolean[max+1];
	    for(int i=0; i<a.size(); i++){
	        int temp = a.get(i);
	        if(temp > 0)
	            values[temp] = true;
	    }
	    
	    for(int i=min; i<=max; i++){
	        if(!values[i])
	            return i;
	    }
	    
	    return max + 1;
	}
}

