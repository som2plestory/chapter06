package com.javaex.ex04;

public class Ex01 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Thread thread = new Thread(new DigitImpl());
		thread.start();
		
		Thread thread1 = new Thread(new DigitImpl());
		Thread thread2 = new Thread(new LowerImpl());
		Thread thread3 = new Thread(new UpperImpl());
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}
	}

}
