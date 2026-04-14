package chapter.chapter06_Class;

class Student2 {
	// 클래스 변수: 모든 객체가 공유
	public static int serialNum;
	
	// 인스턴스 변수: 객체마다 따로 가짐
	private int studentId;
	private String studentName;
	
	// static 초기화 블록: 클래스가 처음 로딩될때 단 한번 실행
	static {
		serialNum = 1000;
		System.out.println("static 초기화 브르록 실행");
	}
	
	// instance 초기화 블록: 객체가 생성될때마다 생성자보다 먼저 호출
	{
		serialNum++;
		studentId = serialNum;
		System.out.println("인스턴스 초기화 블록 실행");
	}
	
	// 기본 생성자
	public Student2() {
		System.out.println("기본 생성자 호출");
	}
	
	// 명시적 생성자
	public Student2(String studentName) {
		System.out.println("명시적 생성자 호출");
		this.studentName = studentName;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}

public class C056_Static3 {
	public static void main(String[] args) {
		
		System.out.println("현재 serialNum: " + Student2.serialNum);
		System.out.println();
		
		Student2 lee = new Student2();
		lee.setStudentName("이지원");
		System.out.println(lee.getStudentName() + "의 학번: " + lee.getStudentId());
		System.out.println("현재 serialNum: " + Student2.serialNum);
		System.out.println();
		
		Student2 son = new Student2();
		son.setStudentName("손흥민");
		System.out.println(son.getStudentName() + "의 학번: " + son.getStudentId());
		System.out.println("현재 serialNum: " + Student2.serialNum);
		System.out.println();
		
		Student2 park = new Student2("박미경");
		System.out.println(park.getStudentName() + "의 학번: " + park.getStudentId());
		System.out.println("현재 serialNum: " + Student2.serialNum);
		System.out.println();
	}

}
