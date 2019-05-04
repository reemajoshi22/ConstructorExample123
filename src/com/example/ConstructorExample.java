package com.example;

public class ConstructorExample {
	 ConstructorExample(){
		 
		System.out.println("No argument constructor");
	}
	 ConstructorExample(int a){
		a=5;
		System.out.println("This is a parameterised constructor and value of parameter a is"+a);
		
	}

}

 class MainClass extends ConstructorExample{
//	 MainClass(int a) {
//		super(a);
//		// TODO Auto-generated constructor stub
//	}
MainClass(){
	System.out.println(" MainClass No argument constructor");
}
	public static void main(String args[]){
		
		 //ConstructorExample object=new ConstructorExample();
//		 ConstructorExample object2=new ConstructorExample(5);
		 MainClass mainclassobject=new MainClass();
		 
	 }
	
}