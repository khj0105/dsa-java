package chapter.chapter10_Abstraction;

/*
	[ 추상 클래스 ]	- abstract
	구조
		- 멤버 변수
		- 생성자
		- 일반 메서드
		- 추상 메서드
		
	특징
		1. 클래스 앞에 abstract 예약어 붙임
		2. 추상 메서드(구현부가 없는 메서드)를 가질 수 있다.(없을 수두 있다.)
		3. 추상 클래스는 객체를 직접 생산할 수 없다.
		4. 상속을 통해서만 사용이 가능하다.
		5. 하위 클래스는 추상 메서드를 반드시 오버라이딩 해야 한다.
		(오버라이딩 하지 않으면 하위 클래스도 abstract가 되어야 한다.)
 */
abstract class Animal {
	// 멤버 변수
	String name;
	
	// 생성자
	Animal(String name) { this.name = name; }
	
	// 일반 메서드
	void alive() {
		System.out.println(name + "은(는) 생물입니다.");
	}
	
	// 추상 메서드
	abstract void move(); // {}는 없음.
}

class Human extends Animal {
	Human(String name) {super(name);}
	
	@Override
	void move() {
		System.out.println(name + "은(는) 두 발로 걷습니다.");
	}
}

class Tiger extends Animal {
	Tiger(String name) { super(name); }
	
	@Override
	void move() {
		System.out.println(name + "은(는) 네 발로 뜁니다.");
	}
}

class Eagle extends Animal {
	Eagle (String name) { super(name); }
	
	@Override
	void move() {
		System.out.println(name + "은(는) 하늘을 납니다.");
	}
}
public class C081_Abstract {
	public static void main(String[] args) {
		
		// 추상클래스는 객체 생성 불가
//		Animal animal = new Animal("동물");	// 오류
		
		Animal a = new Human("사람");
		Animal b = new Tiger("호랑이");
		Animal c = new Eagle("독수리");
		
		a.alive();
		a.move();
		
		b.alive();
		b.move();
		
		c.alive();
		c.move();
	}
}
