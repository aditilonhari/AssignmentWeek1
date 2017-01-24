/*
Problem Statement: Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.
*/

public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    
	   if(a.size() == 0)
	        return -1;
	    
	    int result = -1;
	    HashMap<Integer, Integer> myMap = new HashMap<>();
	    for(int i=0; i<a.size(); i++){
	        int currentElement = a.get(i);
	        if(myMap.containsKey(currentElement)){
	            result = currentElement;
	            break;
	        }
	        else{
	            myMap.put(currentElement, 1);
	        }
	    } 
	   
	   return result;
	}
}

