package chapter.chapter08_Inheritance;

/*
	[ 메서드 오버라이딩 ]
	상속 관계에 있을 경우, 부모클래스의 메서드를 자식클래스에서 재정의하는 것
	
	[ 오버라이딩 조건 ]
	1. 상속관계에서만 가능
	2. 메서드 이름이 같아야 한다.
	3. 매개변수의 타입, 개수, 순서가 같아야 한다.
	4. 리턴 타입이 같아야 한다.
	5. 접근제어자는 부모와 같거나 더 넓어야 한다.
 */

class AA {
	public void method() {
		System.out.println("부모 클래스의 method()");
	}
}
class BB extends AA {
	@Override
	public void method() {
		System.out.println("자식 클래스의 methhod()");
	}
}
public class C072_Overriding1 {
	public static void main(String[] args) {
		
		// 다형적 변수
		// 참조타입 / 생성타입
		AA aa = new AA();
		AA ab = new BB();
		BB bb = new BB();
		
		aa.method(); // 메서드의 호출은 생성타입에 의해 결정
		ab.method();
		bb.method();
	}
}
