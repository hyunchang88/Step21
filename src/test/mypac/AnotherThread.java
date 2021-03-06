package test.mypac;
/*
 *  [  Thread (작업단위) 만들기  ]
 * 	 
 * 	 ( 방법1 )
 * 
 *  1. Thread 클래스를 상속받아서 클래스를 정의한다.
 *  2. run() 메소드를 오버라이딩한다.
 *  	run 메소드 안에 새로운 스레드에서 작업하고 싶은 코딩을 한다. 
 *  3. 새로운 Thread 가 필요한 시점에 객체를 생성하고 start() 메소드를 호출한다.
 */
public class AnotherThread extends Thread{ // 1
	
	// 2
	@Override 
	public void run() {
		// 여기서 원하는 코딩을 한다.
		System.out.println("새로운 스레드 시작!");
		try{
			Thread.sleep(5000);
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println("새로운 스레드가 종료 됩니다.");
	}
	
}
