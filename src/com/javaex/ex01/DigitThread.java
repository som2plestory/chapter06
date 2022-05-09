package com.javaex.ex01;


/*
//Thread
필드
생성자
메소드
	(출장기능....)
		(해야할 일 0-9) ????
		(run)
	(종료)
*/

public class DigitThread extends Thread{

		
		//필드
		
		//생성자
		
		//메소드 -gs
		
		//메소드 -일반
		@Override
		public void run() {
			for(int i=0; i<26; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
	
	}

	
}
