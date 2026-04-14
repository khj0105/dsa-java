package chapter.chapter06_Class;

/*
		클래스(class) : 변수(데이터)와 메서드(기능)을 하나로 묶어서 만드는
						사용자 정의 타입
		객체(object) : 메모리에 생성된 모든 대상
		인스턴스(Instance) : 특정 클래스를 기반으로 생성된 객체
 */

class Student {
	// 멤버 변수(속성, 상태)
	String name;
	int age;
	
	// 멤버 메서드(기능)
	void introduce() {
		System.out.println("이름: " + name + ", 나이: " + age);
	}
	
	void study() {
		System.out.println(name + " 학생이 공부를 합니다.");
	}
}
public class C045_Basic1 {
	public static void main(String[] args) {
		Student s1 = new Student();		// s1 = Student 의 인스턴스, 객체
		
		s1.name = "홍길동";
		s1.age = 20;
		s1.introduce();
		s1.study();
		
		Student s2 = new Student();
		s2.name = "이순신";
		s2.age = 22;
		s2.introduce();
		s2.study();
	}
}
