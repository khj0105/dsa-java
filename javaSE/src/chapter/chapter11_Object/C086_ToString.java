package chapter.chapter11_Object;

/*
	[ toString() ]
	Object 클래스의 toString() 메서드
	객체의 정보를 문자열 형태로 변환하는 메서드
	
	구조
		클래스이름 @ 해시코드
		ex. Human@5e91993f
		
	* 필요에 따라 객체의 정보를 보기 쉽게 출력하기 위해
		toString()를 오버라이딩하여 사용한다.
 */
public class C086_ToString {
	public static void main(String[] args) {
		
		// 기본형 데이터
		int i = 1234;
		System.out.println(i);
		
		// 객체
		Human kim = new Human(29, "김상형");
		
		System.out.println("=== 객체의 멤버 출력 ===");
		System.out.println(kim.age);
		System.out.println(kim.name);
		
		System.out.println("=== 객체 출력 ===");
		System.out.println(kim);	// 인스턴스를 출력한다는 거는 toString()이 생략된것과 같다. 해당 클래스의 정보 "@" 16진수 해쉬태그
		System.out.println(kim.toString());
		
	}
}
