package com.example;
import java.util.*; 
public class HashMapExample {
	public static void main(String args[]){  
		  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(102,"Rahul");  
		  System.out.println("Values before remove: "+ hm);    
		  hm.remove(102);
		  System.out.println("Values after remove: "+ hm);
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  
}
