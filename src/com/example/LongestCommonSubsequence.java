package com.example;

public class LongestCommonSubsequence {
	int printIndex,len1,len2;
	
	public int getLongestCommonSubsequence(String arg1,String arg2){
		 len1=arg1.length();
		 len2=arg2.length();
		int[][] longestlength=new int[len1+1][len2+1];
		for(int i=0;i<=len1;i++){
			for(int j=0;j<=len2;j++){
				if(i==0||j==0){
					longestlength[i][j]=0;
				}
				else if(arg1.charAt(i-1)==arg2.charAt(j-1)){
					longestlength[i][j] = 1 + longestlength[i-1][j-1];
				}else{
					longestlength[i][j] = Math.max(longestlength[i-1][j], longestlength[i][j-1]);
				}
			}
			
		}
		printIndex=longestlength[len1][len2];
		System.out.println(longestlength[len1][len2]);
		return longestlength[len1][len2] ;
		
	}

	
	public static void main(String[] args){
		LongestCommonSubsequence obj=new LongestCommonSubsequence();
		obj.getLongestCommonSubsequence("reema","riya");
	}

	

}
