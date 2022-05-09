package com.javaex.ex01;

public class Ex01 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//출장가서 준비되는대로 시작해라(숫자찍어라)
		Thread thread = new DigitThread();
		//thread.start();
		//thread.run();	//비교해볼것
		thread.start();
		
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000); //1000번 찍을 때마다 쉬어
			
		}
		
	}

}
