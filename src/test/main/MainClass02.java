package test.main;

import test.mypac.AnotherThread;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		// 3
		// AnotherThread 객체 생성하고
		AnotherThread at = new AnotherThread();
		// start() 메소드 호출해서 새로운 작업단위를 시작 시킨다.
		at.start();
		
		AnotherThread at2 = new AnotherThread();
		at2.start();
		
		System.out.println("메인 메소드가 종료 됩니다.");
	}
}
