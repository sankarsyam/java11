package com.study;
public class LambdaSample {

	public static void main(String args[]) {
//		Thread th= new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("Inside another thread	");
//				
//			}
//		});
		
		Thread th= new Thread(() -> 
				// TODO Auto-generated method stub
				System.out.println("Inside another thread	"));
		th.start();
		System.out.println("In Main thread");
	}
}
