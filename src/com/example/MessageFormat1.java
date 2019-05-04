package com.example;

import java.text.MessageFormat;

public class MessageFormat1 {

	
	public static void main(String args[]){
		MessageFormat1 messageFormat=new MessageFormat1();
		messageFormat.printMessageFormat();
		System.out.println(messageFormat.printMessageFormat());
	 }

	private String printMessageFormat() {
		
		 return MessageFormat.format("{0},{1},{2}", "abc",null,"");

		
		
	}
	
	
}
