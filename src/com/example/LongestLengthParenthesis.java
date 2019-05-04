package com.example;

public class LongestLengthParenthesis {
	public int getLongestLengthParenthesis(String s){
		int count=0;
		int validLength = 0;
		int openParenthesisCount = 0;
		int maxValidLength = 0;
		int len=s.length();
		 System.out.println("length" +len);
		 for (int i = 0; i < s.length(); i++) {
				char parenthesis = s.charAt(i);
				if(parenthesis == '(') {
					openParenthesisCount++;
				} else {
					if(openParenthesisCount > 0) {
						openParenthesisCount--;
						validLength = validLength + 2;
					} else {
						validLength = 0;
						openParenthesisCount = 0;
					}
				}
				if(maxValidLength < validLength) {
					maxValidLength = validLength;
				}
			}
		 System.out.println("maxValidLength" +maxValidLength);
			return maxValidLength;
	}
		
	public static void main(String[] args){
		LongestLengthParenthesis obj=new LongestLengthParenthesis();
		obj.getLongestLengthParenthesis(")()())");//())()(), )()())
	}
	}


