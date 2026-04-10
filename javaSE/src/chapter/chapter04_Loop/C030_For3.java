package chapter.chapter04_Loop;

public class C030_For3 {
	
	// 클래스 = 멤버변수 + 멤버메서드
	static int memberValue = 999;		// 멤버 변수
	
	public static void main(String[] args) {		// 멤버 메서드
/*
		[ 변수의 유효 범위 ]
		1. 지역 변수
			- 메서드, if문, for문 등의 블록 안에서 선언되는 변수
			- 선언된 블록 안에서만 사용 가능
			- 블록이 끝나면 사용할 수 없음
		2. 전역 변수(멤버변수)
			- 클래스 내부, 메서드 밖에서 선언되는 변수
			- 클래스의 여러 메서드에서 사용 가능
			- 객체 생성시 자동으로 기본값이 초기화됨
 */
		
		System.out.println("멤버변수 출력: " + memberValue);
		
		// main 메서드의 지역변수
		int outerValue = 10;
		System.out.println("main 블록의 outerValue: " + outerValue);
		
		if (true) {
			System.out.println("if문 안에서 outerValue: " + outerValue);
			System.out.println("if문 안에서 memberValue: " + memberValue);
			
			// if 블록 내부 지역변수
			int innerValue = 100;
			System.out.println("if문 안에서 inneerValue: " + innerValue);
			
			for (int k = 0; k < 2; k++){
				System.out.println("for문 안에서 outerValue: " + outerValue);
				System.out.println("for문 안에서 innerValue: " + innerValue);
				System.out.println("for문 안에서 k: " + k);
			}
			
//			System.out.println(k); // err
		}
		
//		System.out.println(innerValue);	// err
	}
}
