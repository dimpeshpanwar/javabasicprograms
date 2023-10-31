/*
Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).
The digits are stored such that the most significant digit is at the head of the list.
*/

public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
	    
	    int size;
	    int carry = 1;
	    int num;
	    
	    size = A.size();
	    
	    for (int i = size - 1; i >= 0; i--) {
	        
	        num = A.get(i);
	        num += carry;
	        carry = 0;
	        
	        if (num == 10) {
	            num = 0;
	            carry = 1;
	        }
	        
	        A.set(i, num);
	        
	    }
	    
	    ArrayList<Integer> res = new ArrayList<Integer>();
	    
	    if (carry == 1)
	        res.add(1);
	    
	    for (int x : A) {
	        if (x == 0 && res.size() == 0)
	            continue;
	        res.add(x);
	    }
	    
	    return res;
	    
	}
}
