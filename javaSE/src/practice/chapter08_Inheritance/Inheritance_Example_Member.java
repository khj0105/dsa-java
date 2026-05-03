package practice.chapter08_Inheritance;

/*
	쇼핑몰 회원 결제 프로그램을 작성하시오.

	부모 클래스 Member를 만들고 아이디, 이름을 저장한다.
	Member에는 할인 금액을 구하는 getDiscount(), 적립 포인트를 구하는 getPoint(), 회원 정보를 출력하는 showInfo() 메서드를 작성한다.
	
	NormalMember는 Member를 상속받고,
	할인율 5%, 적립률 2%가 되도록 getDiscount(), getPoint()를 오버라이딩한다.
	(** 오버라이딩된 메서드의 호출은 생성타입을 따라간다. **)
	
	VIPMember는 Member를 상속받고,
	추가로 등급을 가진다.
	할인율 10%, 적립률 5%가 되도록 getDiscount(), getPoint()를 오버라이딩한다.
	showInfo()도 오버라이딩하여 등급까지 출력한다.
	
	main()에서는
	일반회원(user01, 김철수),
	VIP회원(vip01, 이영희, GOLD)
	객체를 생성하고,
	상품 금액 100000원에 대한 할인 금액, 실제 결제 금액, 적립 포인트를 출력하시오.
*/

class Member {
	String id;
	String name;
	
	Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	int getDiscount(int price) {
		return 0;
	}
	
	int getPoint(int price) {
		return price * 1 / 100;
	}
	
	void showInfo() {
		System.out.println("아이디 : " + id);
		System.out.println("이름 : " + name);
	}
}

class NormalMember extends Member {
	
	NormalMember(String id, String name) {
		super(id, name);
	}
	
	@Override
	int getDiscount(int price) {
		return price * 5 / 100;
	}
	
	@Override
	int getPoint(int price) {
		return price * 2 / 100;
	}
}

class VIPMember extends Member {
	String grade;
	
	VIPMember(String id, String name, String grade) {
		super(id, name);
		this.grade = grade;
	}
	
	@Override
	int getDiscount(int price) {
		return price * 10 / 100;
	}
	
	@Override
	int getPoint(int price) {
		return price * 5 / 100;
	}
	
	@Override
	void showInfo() {
		System.out.println("아이디 : " + id);
		System.out.println("이름 : " + name);
		System.out.println("등급 : " + grade);
	}
}

public class Inheritance_Example_Member {
	
	public static void main(String[] args) {
		NormalMember normal = new NormalMember("user01", "김철수");
		VIPMember vip = new VIPMember("vip01", "이영희", "GOLD");
		
		int price = 100000;
		
		System.out.println("===== 일반회원 =====");
		normal.showInfo();
		int normalDiscount = normal.getDiscount(price);
		int normalPoint = normal.getPoint(price);
		System.out.println("상품 금액 : " + price + "원");
		System.out.println("할인 금액 : " + normalDiscount + "원");
		System.out.println("실결제 금액 : " + (price - normalDiscount) + "원");
		System.out.println("적립 포인트 : " + normalPoint + "점");
		
		System.out.println();
		
		System.out.println("===== VIP회원 =====");
		vip.showInfo();
		int vipDiscount = vip.getDiscount(price);
		int vipPoint = vip.getPoint(price);
		System.out.println("상품 금액 : " + price + "원");
		System.out.println("할인 금액 : " + vipDiscount + "원");
		System.out.println("실결제 금액 : " + (price - vipDiscount) + "원");
		System.out.println("적립 포인트 : " + vipPoint + "점");
	}
}