package chapter.chapter11_Object;

public class Student {
	String name;
	int stdNum;
	
	Student() {}
	
	public Student(String name, int stdNum) {
		this.name = name;
		this.stdNum = stdNum;
	}
	
	@Override
	public boolean equals(Object o) {
		// Student 객체의 경우 "학번이 같으면 같은 학생"으로
		// 판단하도록 equals를 재정의 한다.
		
		// 1. 같은 객체인지 확인
		if (this == o)
			return true;
		
		// 2. null 체크
		if (o == null)
			return false;
		
		// 3. 클래스 타입 확인
		if (getClass() != o.getClass())
			return false;
		
		// 4. 형 변환
		Student other = (Student) o;
		
		// 5. 실제 데이터 비교
		return this.stdNum == other.stdNum;
	}
	
	/*
		hasCode()
		객체를 빠르게 찾기 위한 정수값
		equals가 true면 hashCode도 반드시 같아야 한다.
		
		여기서는 학번을 기준으로 동일성을 판단하므로
		편의상 hasCode를 학번으로 사용함
 */
	@Override
	public int hashCode() {
		return stdNum;
	}
}
