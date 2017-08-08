package com.thread.java;

public class Prime implements Runnable{

	public void run() {
		
		for(int i=1;i<10;i++){
			
			if(i==2||i==3||i==5||i==7)
				System.out.println(" prime numbers"+i);
			}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
	class NonPrime extends Thread{
		
		public void run() {
			
			for(int i=1;i<10;i++){
				
				if(i==4||i==6||i==8||i==9||i==10)
					System.out.println("non prime numbers"+i);
				}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	}