package chapter.chapter05_Method;

public class C039_Method2 {
	public static void main(String[] args) {
		
		// 메서드 호출
		// 1. 매개변수 X, 반환값 X
		method01();
		
		// 2. 매개변수 X, 반환값 O
		String result = method02();
		System.out.println("method02 반환값: " + result);
		
		// 3. 매개변수 O, 반환값 X
		method03(10);
		
		// 4. 매개변수 O, 반환값 O
		System.out.println("method04 반환값: " + method04(1, 2));
	
	}
	
	// 메서드 정의
	// 1. 매개변수 X, 반환값 X
	// void -> 반환할게 없으면 반환하지 않겠다라는 의미
	public static void method01() {
		System.out.println("[method01]");
		System.out.println("단순 실행 메서드");
	}
	
	// 2. 매개변수 X, 반환값 O
	public static String method02() {
		System.out.println("[method02]");
		System.out.println("문자열을 반환하는 메서드");
		
		String result = "반환값";
		return result;
	}
	
	// 3. 매개변수 O, 반환값 X
	public static void method03(int a) {
		System.out.println("[method03]");
		System.out.println("전달받은 값: " + a);
	}
	
	// 4. 매개변수 O, 반환값 O
	public static int method04(int a, int b) {
		System.out.println("[method04]");
		int sum = a + b;
		return sum;
	}
}
