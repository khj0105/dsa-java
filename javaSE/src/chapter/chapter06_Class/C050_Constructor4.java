package chapter.chapter06_Class;

/*
		초기화 블록
		1. static 초기화 블록
			- 클래스가 처음 로딩될 때 한 번만 실행
		
		2. instance 초기화 블록
			- 객체가 생성될 때마다 실행
			- 생성자보다 먼저 실행
 */

class ScitCenter {
	static int num = 1000;
/*
	초기화 순서
	1. 클래스 변수: 기본값 -> 명시적 초기화 -> 클래스 초기화 블럭
	2. 인스턴스 변수: 기본값 -> 명시적 초기화
					-> 인스턴스 초기화 블럭 -> 생성자
	
	기본값: int, long .. = 0, boolean = false, 참조형 = null
 */
	// 클래스 변수(정적 변수) : 모든 객체가 공유
	static int totalClass;		// 개설된 총 기수
	static String courseName;	// 과정명
	
	// 인스턴스 변수 : 각 객체가 가지는 값
	int classNumber;
	
	// static 초기화 블록
	static {
		courseName = "SCIT MASTER";
		System.out.println("교육과정 초기화 완료");
//		classNumber = 10;		// err
	}
	
	// instance 초기화 블록
	{
		totalClass++; // static 변수는 먼저 생성되었기 때문에 이후의 instance 블록에 넣을 수 있다.
		classNumber = 11 + totalClass;
		System.out.println("신규 기수 개설 준비");
	}
	
	// 생성자
	ScitCenter() {
		System.out.println(classNumber + "기 과정 개설 완료");
	}
}

public class C050_Constructor4 {
	public static void main(String[] args) {
	
		ScitCenter c1 = new ScitCenter();
		ScitCenter c2 = new ScitCenter();
		ScitCenter c3 = new ScitCenter();
		System.out.println();
		System.out.println("c1 기수: " + c1.classNumber + "기");
		System.out.println("c2 기수: " + c2.classNumber + "기");
		System.out.println("c3 기수: " + c3.classNumber + "기");
		
		System.out.println("총 개설된 기수: " + ScitCenter.totalClass);
		System.out.println("과정명: " + ScitCenter.courseName);
		
		System.out.println(c1.totalClass); // 권장 x 인스턴스를 만들지 않고 호출 할때는 클래스명을 앞에 붙이고 호출하면 됨.
		System.out.println(c1.courseName);
	}
}
