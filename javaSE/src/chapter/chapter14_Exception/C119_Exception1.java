package chapter.chapter14_Exception;

/*
	[ 예외 처리 (Exception Handling) ]
	프로그램 실행 중 발생할 수 있는 오류를 처리하여
	프로그램이 비정상적으로 종료되는 것을 막는 것.
 */
public class C119_Exception1 {
	public static void main(String[] args) {
		
		int a = 2;
		int b = 0;
		int c;
		
		System.out.println("프로그램 시작");
		
		// 1. 예외가 발생하는 코드
//		c = a / b;
//		System.out.println("결과: " + c);
		
		// 2. 조건문으로 예외를 예방
		if (b != 0) {
			c = a / b;
			System.out.println("결과: " + c);
		} else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		// 3. try-catch를 이용한 예외 처리
		try {
			System.out.println("나눗셈 시도");
			c = a / b;		// ArithmeticException 클래스 -> exception 인스턴스 발생
			System.out.println("결과: " + c);
		} catch (Exception e) { // Exception e = new ArithmeticException() 과 같다, ArithmeticException e로도 가능한데 Exception e 더 상위의 것으로 예외처리도 가능 다형성
			System.out.println("예외 발생!");
			
			// 예외 정보 출력
			e.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		System.out.println("프로그램 실행 완료");
	}
}
