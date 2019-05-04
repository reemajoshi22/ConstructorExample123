package com.example;

interface TestInterface1
{
    // default method
    default void show()
    {
        System.out.println("Default TestInterface1");
    }
    static void print()
    {
        System.out.println("Static1 Method Executed");
    }
  
}
 
interface TestInterface2
{
    // Default method
    default void show()
    {
        System.out.println("Default TestInterface2");
    }
    static void print()
    {
        System.out.println("Static2 Method Executed");
    }
}
 
// Implementation class code
class TestClass implements TestInterface1, TestInterface2
{
    // Overriding default show method
    public void show()
    {
        // use super keyword to call the show
        // method of TestInterface1 interface
        TestInterface1.super.show();
    	
 
        // use super keyword to call the show
        // method of TestInterface2 interface
        TestInterface2.super.show();
    }
    
 
    public static void main(String args[])
    {
        TestClass d = new TestClass();
        d.show();
        TestInterface1.print();
        TestInterface2.print();
        
    }
}