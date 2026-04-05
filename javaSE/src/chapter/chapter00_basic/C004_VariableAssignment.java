package chapter.chapter00_basic;

public class C004_VariableAssignment {
	
	public static void main(String[] args) {
		
		// 변수 선언
		int number;		// 정수형 데이터를 저장할 수 있는 박스 생성
		
//		System.out.println(number);		// 오류 발생
//		String name;
//		System.out.println(name.toString());
		
		// 변수 초기화
		int number2 = 100;
		number2 = 200;		// 값을 할당
		
		// 다른 변수에 값 대입
		number = number2;
		System.out.println(number);
		System.out.println(number2);
		
		// 변수 값 계산
		int sum = number + number2;
		System.out.println("합계 : " + sum);
		
		
	}
}
