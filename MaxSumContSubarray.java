/*
Problem Statement: Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
*/
public class Solution {
	// DO NOT MODFIY THE LIST. 
	public int maxSubArray(final List<Integer> a) {
	    
	    if(a.size() == 0)
	        return 0;
	       
	    int maxSum = 0;
	    int currentSum = 0;
	    int negativeSum = a.get(0);
	    
	    for(int i=0; i<a.size(); i++){
	        currentSum += a.get(i);
	        
	        if(currentSum < 0 && maxSum == 0){
	            if(currentSum > negativeSum)
	                negativeSum = currentSum;
	        }
	        
	        if(currentSum < 0){
	            currentSum = 0;
	        }
	        
	        if(currentSum > maxSum){
	            maxSum = currentSum;
	        }
	    }

        if(maxSum == 0)
            return negativeSum;
	    return maxSum;
	}
}
