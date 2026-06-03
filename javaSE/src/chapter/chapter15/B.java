package chapter.chapter15;

public class B {
	public static void main(String[] args) {
		/*
			데이터 타입
			1. 기본형: boolean(1), byte(1), short(2), int(4), long(8), float(4), double(8), char(2)
			2. 참조형: String, Integer, ....
			
			int a = 10,
			int=데이터 타입, a=변수명 = = 대입연산자, 10=값(리터럴)
		 	string s = "Hello" s에는 정확한 값이 저장된게 아니라 hello가 저장된 곳의 주소값을 s가 가짐 -> 그래서 참조형 데이터타입
		 	
		 	
		 	
		 	class는
		 	변수, 생성자, 메서드를 가짐. 변수, 생성자, 메서드를 클래스의 멤버라고함.
		 	변수를 멤버변수, 필드라고 함.
		 	(메서드)public void add() {
		 		int a = 10;(메서드 안에 선언된 변수: 로컬 변수, 지역 변수)
		 	} public은 접근제어자 void는 리턴타입 add는 메서드명 ()는 파라미터(argument) {}는 메서드의 body
		 	
		 	int a = 10;
		 	A a = new A();		A는 데이터 타입, a는 변수명, = 대입연산자, new A()는 리터럴(딱 정해진 값 x)아니고 데이터, 값을 뜻함
		 	둘은 하는 행위가 같다.
		 	
		 	HDD -> Memory로 옮겨 실행해야함(HDD에는 설치만 되어있지 실행이 안된것이기에 실행을 하려면 Memory에 올라가야지만 실행이 되는것)
		 	클래스(그저 설치되어 있는 것)				->				JVM에서 실행중인 클래스가 인스턴스(객체)이다.
		 	class A {											메모리에 올리기 위해서는 생성자를 호출해야 함.(이걸 클래스를 생성 그리고 생성 하기 위해 필요한게 생성자)
		 		int a = a;										A a = new A();에서 new는 객체를 생성할때 쓰는 문법 A()가 생성자
		 		public void add() {								생성자는 바꿀수 있는게 있고, 바꿀 수 없는게 있다.
		 		---
		 		}												A a = new A(); A b = new A(); 인스턴스가 2개 각각 다른 인스턴스를 호출(주소값이 다름)
		 	}
		 */
	}
}

//public class A {
//	// 필드(멤버변수)
//	int a = 10;
//	// 생성자(묵시적-기본 생성자, 명시적 생성자)
//	// 1. 생성자명과 클래스명은 같다.
//	// 2. 리턴타입이 없다.
//	public A(){} - 명시적 생성자(아무것도 하지 말라고 프로그래머가 지정)
//	// 메서드
//	public void add() {};
//}