package com.example;

import java.util.Stack;

public class LongestLenParenthesis {
	private int getLongestLenByStack(String s) {
	    //use last to store the last matched index
	    int len = s.length(), maxLen = 0, last = -1;
	    
	    if (len == 0 || len == 1)
	        return 0;

	    //use this stack to store the index of '('
	    Stack<Integer> stack = new Stack<Integer>();
	    for (int i = 0; i < len; i++) {
	        if (s.charAt(i) == '(') 
	            stack.push(i);
	        else {
	            //if stack is empty, it means that we already found a complete valid combo
	            //update the last index.
	            if (stack.isEmpty()) {
	                last = i;        
	            } else {
	                stack.pop();
	                //found a complete valid combo and calculate max length
	                if (stack.isEmpty()) 
	                    maxLen = Math.max(maxLen, i - last);
	                else
	                //calculate current max length
	                    maxLen = Math.max(maxLen, i - stack.peek());
	            }
	        } 
	    }
	    System.out.println("maximum parenthesis length"+maxLen);
	    return maxLen;
	}
	public static void main(String[] args){
		LongestLenParenthesis obj=new LongestLenParenthesis();
		obj.getLongestLenByStack("(()))()");
	}
}
