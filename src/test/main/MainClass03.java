package test.main;

import test.mypac.YourThread;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 됩니다.");
		
		//YourThread yt = new YourThread();
		//Runnable yt = new YourThread();
		//Object yt = new YourThread();
		
		//Runnalbe type 의 참조값 얻어내고
		Runnable yt = new YourThread();
		// Thread 객체를 생성하면서 Runnable type 참조값 전달
		Thread thread = new Thread(yt);
		// Thread 객체의  start() 메소드를 이용해서 스레드 시작시키기
		thread.start();
		
		System.out.println("메인 메소드가 종료 됩니다.");
	}
}
