package chapter.chapter00_basic;

// 생성한 클래스
public class C002_PrintTest {
	
	// 클래스 = 변수 + 메서드
	
	// 프로그램 시작 메서드
	// java 프로그램은 항상 main() 에서 시작한다
	public static void main(String[] args) {
		
		// main 메서드 안에 실행할 코드 작성
		
		System.out.println("프로그램 시작"); // 문자열 출력
		System.out.println(1234);		   // 정수 출력
		
		// sout + 엔터
		
		// 문자(char) 출력 ' '
		System.out.println('아');
		
		// 문자열(String) 출력 " "
		System.out.println("안녕하세요");
		
		// 문자열 연결
		System.out.println("나이 : " + 20);
		System.out.println("이름 : " + "홍길동");
		
		// 계산 출력
		System.out.println(10 + 20);
		System.out.println("10 + 20 = " + (10 + 20)); // "10 + 20 = " + 10 + 20이면 1020이렇게 붙어서 나옴
	}
	
}
