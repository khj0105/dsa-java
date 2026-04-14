package chapter.chapter06_Class;

/*
		초기화 블록
		- 객체가 생성될 때 실행되는 블록
		- 생성자보다 먼저 실행됨
		- 모든 생성자에서 공통으로 실행되는 초기화 코드를 작성할때 사용
 */

class Animal {
	String name;
	int age;			// this.age 중복 생성이 가능하다
	
	// 초기화 블록
	{
		System.out.println("초기화 블록 실행");
		name = "이름 없음";
		age = 0;
	}
	
	// 기본 생성자
	Animal() {
		System.out.println("기본 생성자 실행");
	}
	
	// 명시적 생성자
	Animal(String name, int age) {
		System.out.println("명시적 생성자 실행");
		this.name = name;
		this.age = age;
	}
	
	void info() {
		System.out.println("이름: " + name + ", 나이: " + age);
	}
}

public class C049_Constructor3 {
	public static void main(String[] args) {
		System.out.println("객체 생성1");
		Animal a1 = new Animal();
		a1.info();
		System.out.println();
		
		System.out.println("객체 생성2");
		Animal a2 = new Animal("강아지", 3);
		a2.info();
		System.out.println();
		
		System.out.println("a1 == a2 : " + (a1 == a2));
	}
}
