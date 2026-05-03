package practice.chapter09_Polymorphism;

/*
	문제
	다형성을 이용하여 결제 시스템을 구현하세요.
	
	요구사항
	1. Payment 클래스를 생성한다.
	2. CardPayment, CashPayment 클래스를 생성한다.
	3. Payment 클래스를 상속받는다.
	4. pay() 메서드를 오버라이딩한다.
*/

class Payment {
	void pay() {
		System.out.println("결제 진행");
	}
}

class CardPayment extends Payment {
	@Override
	void pay() {
		System.out.println("카드 결제 진행");
	}
}

class CashPayment extends Payment {
	@Override
	void pay() {
		System.out.println("현금 결제 진행");
	}
}

public class Polymorphism_Example_Payment {
	
	public static void main(String[] args) {
		
		Payment p1 = new CardPayment();
		Payment p2 = new CashPayment();
		
		payDevice(p1);
		payDevice(p2);
		
	}
	
	public static void payDevice(Payment p) {
		p.pay();
	}
}