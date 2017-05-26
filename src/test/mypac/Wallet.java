package test.mypac;
/*
 * 		가상의 지갑 역할을 할 클래스
 */
public class Wallet {
	// static 맴버필드
	public static int totalMoney;
	
	// 돈을 저장하는 static 맴버 메소드
	public static void addMoney(int money){
		totalMoney += money;
	}
	
	// 돈을 인출하는 static 맴버 메소드
	public static synchronized int getMoney(String name){
		if(totalMoney>0){
			totalMoney -= 1;
			System.out.println(name+" 가 1만원 인출! 현재잔고 : "+totalMoney);
			return 1;
		}else{
			System.out.println(name+" 이 인출 요청, 더이상 인출할 돈이 없습니다.");
			System.out.println("현재잔고 : "+totalMoney);
			return 0;
		}
	}
}
