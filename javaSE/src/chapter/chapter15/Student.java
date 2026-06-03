package chapter.chapter15;

public class Student extends Person{
	int stdNo;
	// 생성자
	public Student(String name, int age) {
		super(name, age); // 부모 호출
	}
}
