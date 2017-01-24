/*
Problem Statement: You are given a read only array of n integers from 1 to n. 
 		   Each integer appears exactly once except A which appears twice and B which is missing. Return A and B. 
*/

public class Solution {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
	    
	    if(a.size() == 0)
	        return null;
	       
	   ArrayList<Integer> result = new ArrayList<>();
	  
	   int min = a.get(0);
	   int max = a.get(0);
	   int duplicateElement = 0;
	   long currentTotal = 0;
	   //java.math.BigInteger currentTotal = java.math.BigInteger.ZERO;
	   
	   
	   int size = a.size();
	   for(int i=0; i<size; i++){
	       
	       int currentElement = a.get(i);
	       if(currentElement > max){
	           max = currentElement;
	       }
	       
	       if(currentElement < min){
	           min = currentElement;
	       }
	   
	       //currentTotal = currentTotal.add(java.math.BigInteger.valueOf(currentElement));    
	       currentTotal += (long)currentElement;
	   }
	   
	   boolean[] duplicatesMap = new boolean[max+1];
	   
	   for(int i=0; i<size; i++){
	       int temp = a.get(i);
	       
	       if(duplicatesMap[temp]){
	           duplicateElement = temp;
	       }
	       else{
	            duplicatesMap[temp] = true;
	       }
	   }
	   
       long actualTotal = 0;
       if(size%2 == 0){
           actualTotal = size/2;
           actualTotal *= (size+1);
       } else {
           actualTotal = (size+1)/2;
           actualTotal *= size;
       }
	   currentTotal -= (long)duplicateElement;
	   int missingElement = (int)(actualTotal - currentTotal);
	   
	   result.add(duplicateElement);
	   result.add(missingElement);
	    
	   return result;
	}
}
