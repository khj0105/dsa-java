package chapter.chapter08_Inheritance;

/*
	[ 변수와 메서드의 동작 차이 ]
	1. 변수
		참조변수의 타입 기준으로 접근
	2. 메서드
		실제 객체의 타입 기준으로 실행
		(오버라이딩 된 메서드 실행)
		
	즉, 변수 -> 컴파일 / 메서드 -> 실행 시 결정.
 */
class Parent {
	int num = 10;
	
	void show() {
		System.out.println("Parent 메서드: " + num);
	}
}
class Child extends Parent {
	int num = 100;
	
	@Override
	void show() {
		System.out.println("Child 메서드: " + num);
	}
}
public class C073_Overriding2 {
	public static void main(String[] args) {
		// 다형적 변수
		// 참조타입 변수 = new 생성타입();
		// 변수 타입 => 접근 가능한 범위를 제한
		// 생성 타입 => 실제로 동작하는 주체
		Parent p = new Parent();
		Parent pc = new Child();
		Child c = new Child();
		
		System.out.println("=== 변수 접근 ===");
		System.out.println(p.num);
		System.out.println(pc.num);
		System.out.println(c.num);
		System.out.println();
		
		System.out.println("=== 메서드 호출 ===");
		p.show();
		pc.show();
		c.show();
	}
}
