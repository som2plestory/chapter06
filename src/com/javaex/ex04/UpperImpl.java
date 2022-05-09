package com.javaex.ex04;

public class UpperImpl implements Runnable{
	
	@Override
	public void run() {
		
		for(char ch='A'; ch<='A'; ch++) {
			
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
