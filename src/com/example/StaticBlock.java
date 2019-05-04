package com.example;

//The static block only gets called once, when the class itself is initialized,
//no matter how many objects of that type you create.
public class StaticBlock {
	

	    static{
	        System.out.println("Static");
	    }
	    static{
	        System.out.println("Static 2");
	    }

	    {
	        System.out.println("Non-static block");
	    }

	    public static void main(String[] args) {
	    	StaticBlock object = new StaticBlock();
	    	StaticBlock object2 = new StaticBlock();
	    }
	
}
