package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		// Thread 객체 생성해서
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("새로운 작업단위 시작");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("새로운 작업단위 종료");
			} 
		});
		t1.start(); // 새로운 스레드 시작시키기
		
		System.out.println("메인 메소드가 종료 됩니다.");
	}
}
