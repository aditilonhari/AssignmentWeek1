/*
Problem Statement: Given two binary strings, return their sum (also a binary string)
*/
public class Solution {
	public String addBinary(String a, String b) {
	    a = a.trim();
	    b = b.trim();
	    
	    if(a == null && b != null)
	        return b;
	        
	    if(b == null && a != null)
	        return a;
	        
	    int a_len = a.length();
	    int b_len = b.length();
	    
	    int smaller = (a_len > b_len)? b_len : a_len;
	    
	    StringBuilder result = new StringBuilder();
	    String carry = "0";
	    int i = a_len-1, j = b_len-1;
	    
	    while(smaller != 0){
	        
	        int total = Integer.parseInt(carry) + Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(j));
	        String sum = "" + total;
	        if(Integer.valueOf(sum) == 3){
	            carry = "1";
	            sum = "1";
	        }
	        else if(Integer.valueOf(sum) == 2){
	            carry = "1";
	            sum = "0";
	        }
	        else if(Integer.valueOf(sum) == 1){
	            carry = "0";
	            sum = "1";
	        }
	        else {
	            carry = "0";
	            sum = "0";
	        }
	        result.insert(0,sum);
	        i--;
	        j--;
	        smaller--;
	    }
	    
	    while(i >= 0){
	        int total  = Integer.parseInt(carry) + Character.getNumericValue(a.charAt(i));
	        String sum = "" + total;
	        if(Integer.valueOf(sum) == 2){
	            carry = "1";
	            sum = "0";
	        }
	        else if(Integer.valueOf(sum) == 1){
	            carry = "0";
	            sum = "1";
	        }
	        else {
	            carry = "0";
	            sum = "0";
	        }
	        result.insert(0,sum);
	        i--;
	    }
	   
	   while(j >= 0){
	        int total = Integer.parseInt(carry) + Character.getNumericValue(b.charAt(j));
	        String sum = "" + total;
	        if(Integer.valueOf(sum) == 2){
	            carry = "1";
	            sum = "0";
	        }
	        else if(Integer.valueOf(sum) == 1){
	            carry = "0";
	            sum = "1";
	        }
	        else {
	            carry = "0";
	            sum = "0";
	        }
	        result.insert(0,sum);
	        j--;
	    }
	    if(carry == "1")
	        result.insert(0,carry);
	    return result.toString();
	}
}
