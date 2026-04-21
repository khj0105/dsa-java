package chapter.chapter08_Inheritance;

/*
	[ IS-A 관계 ]
	상속 관계를 설명할 때 사용하는 개념
	자식 클래스는 부모 클래스의 한 종류이다.
 */
class Animal {
	void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Person extends Animal {
	@Override
	void move() {
//		super.move(); 바껴도 상관없음
		System.out.println("사람이 걷습니다.");
	}
}

public class C075_Is_A {
	public static void main(String[] args) {
		Animal a = new Animal();	// 동물은 동물이다.
		Person b = new Person();	// 사람은 사람이다.
		Animal c = new Person();	// 사람은 동물이다.
//		Person d = new Animal();	// 오류 (동물은 사람이 아니다.)
		
		a.move();
		b.move();
		c.move();
	}
}
