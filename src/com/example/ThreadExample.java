package com.example;

public class ThreadExample {
	public static void main(String[] args) throws InterruptedException{
		String array[]={"first element","second element",
				"third element","fourth element","fifth element"
				
		};
		for(int i=0;i<array.length;i++){
			//Pause for 5 seconds
			Thread.sleep(5000);
			//Print a message
            System.out.println(array[i]);
		}
	}

}
