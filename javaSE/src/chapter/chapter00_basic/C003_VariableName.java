package chapter.chapter00_basic;

public class C003_VariableName {
	
	public static void main(String[] args) {
		
		/*
				[ 변수의 명명규칙 ] - 오류
				1. 변수의 이름은 영문자(대문자, 소문자)나 숫자 사용
				2. 특수문자 $, _ 만 사용 가능
				3. 변수 이름은 숫자로 시작 불가능
				4. 자바에서 이미 사용 중인 예약어는 불가능
				
				[ 암묵적 규칙 ]
				1. 클래스 이름은 항상 대문자로 시작
				2. 변수 이름은 소문자로 시작
				3. 여러 단어로 이루어진 변수는 대문자로 구분한다(camel-case)
				4. 변수 이름은 의미 있는 단어를 사용
		 */
		
		// 올바른 변수명
		int num;
		int num2;
		int korScore;
		int mathScore;
		int totalScore;
		
		String studentName;			// String 클래스 = 참조형 데이터타입
		
		// 잘못된 변수명 예시
//		int 1num;			// 숫자로 시작 불가
//		int if;				// 예약어를 사용 불가
//		int student-name;	//  - 사용 불가
//		int #num;			// # 사용 불가

		// 사용 에
		studentName = "홍길동";	// 변수를 할당
		int age = 20;			// 변수를 초기화
		
		System.out.println(studentName);
		System.out.println(age);
		
		age = 21;				// 값을 재할당
		System.out.println(age);
		
		// 실행 단축키 : ctrl + shift + F10
	}
}
