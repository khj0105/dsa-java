package chapter.chapter06_Class;

/*
		[ 생성자(constructor) ]
		객체가 생성될때 자동으로 호출되는 메서드의 일종
		
		규칙
		1. 생성자의 이름은 클래스 이름과 같다.
		2. 리턴 타입이 없다. (void도 사용X)
		3. 객체 생성시 자동으로 호출된다.
		4. 하나의 클래스에 여러 개의 생성자를 만들 수 있다. (오버로딩)
 */

class User {
	String name;
	int age;
	
	// 기본 생성자 - 명시적 생성자를 만들시 기본 생성자를 안 만들어도 됨(오버로딩 시 같이 사용 가능), 기본적으로 파라미터가 없으면 기본 생성자를 공짜로 만들어주고 파라미터가 몇 개냐에 따라 호출되는 생성자가 달라짐
	User() {
		System.out.println("기본 생성자 호출");
	}
	
	// 명시적 생성자 (생성자 오버로딩)
	User(String aName) {
		name = aName;
	}
	
	User(String aName, int aAge) {
		name = aName;
		age = aAge;
	}
	
	void userInfo() {
		System.out.println("이름: " + name + ", 나이: " + age);
	}
}

public class C047_Constructor1 {
	public static void main(String[] args) {
		User user1 = new User();
		user1.userInfo();
		User user2 = new User("홍길동");
		user2.userInfo();
		User user3 = new User("이순신", 55);
		user3.userInfo();
	}
}
// stack은 stack, heap 영역보다 먼저 만들어짐
// main, 메서드는 stack
// 인스턴스, new는 heap
// 클래스에 정보를 확인하는 시점 static, static은 클래스를 로딩했을 때 시작이 되지고 끝날때까지 메모리에 남는다.