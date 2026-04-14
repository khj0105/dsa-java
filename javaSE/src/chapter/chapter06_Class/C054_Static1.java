package chapter.chapter06_Class;

/*
		[ static 변수 ]
		1. static 변수
			- 모든 객체가 공유
			- 객체 없이 클래스 이름으로 사용 가능
		2. instance 변수
			- 객체마다 따로 생성됨
			- 객체를 생성해야 사용 가능
 */
class School {
	// static 변수 (학교 이름은 하나만 존재)
	static String schoolName = "부산고등학교";
	// instance 변수 (학생마다 이름이 다름)
	String studentName;
	
	// 생성자
	School(String studentName) {
		this.studentName = studentName;
	}
	
	// instance 메서드
	void printInfo() {
		System.out.println("학생 이름: " + studentName);
		System.out.println("학교 이름: " + schoolName);
	}
}
public class C054_Static1 {
	public static void main(String[] args) {
		School s1 = new School("홍길동"); // s1는 주소값 참조
		School s2 = new School("김철수");
		
		s1.printInfo();
		System.out.println();
		s2.printInfo();
		System.out.println("=================");
		
		// static 변수는 모두가 공유
		System.out.println("s1 학교명: " + s1.schoolName);
		System.out.println("s2 학교명: " + s2.schoolName);
		// 권장 방식
		System.out.println("클래스명으로 접근: " + School.schoolName);
	}
}
