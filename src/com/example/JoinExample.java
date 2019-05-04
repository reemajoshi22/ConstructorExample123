package com.example;

public class JoinExample extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"  "+i);
		}
	}
public static void main(String[] args) {
	JoinExample obj1=new JoinExample();
	JoinExample obj2=new JoinExample();
	JoinExample obj3=new JoinExample();
	obj1.start();
	try {
		obj1.join();//join() method waits for a thread to die
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	obj2.start();
	obj3.start();
	
}
}
