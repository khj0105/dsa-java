package chapter.chapter05_Method;

public class C044_Overloading {
	public static void main(String[] args) {
/*
			[ 오버로딩(Overloading) ]
			- 같은 이름의 메서드를 여러개 정의하는 것(다형성)
			
			[ 조건 ]
				1. 메서드의 이름이 같아야 한다. (필수)
				2. 파라미터의 개수가 달라야 한다. (or)
				3. 파라미터의 타입이 달라야 한다. (or)
				4. 파라미터의 순서가 달라야 한다. (or)
 */
		
		methodTest(5);
		methodTest(5, 3.14);
		methodTest(3.14, 5);
		System.out.println("큰 수(int, int): " + methodTest(3, 5));
		System.out.println("큰 수(double, double): " + methodTest(3.4, 5.6));
		
		
	}
	
	// 1. 파라미터 1개
	static void methodTest(int a) {
		System.out.println("int 1개 전달: " + a);
	}
	
	// 2. 파라미터 개수/ 타입 차이
	static void methodTest(int a, double b) {
		System.out.println("int + double 합계: " + (a + b));
	}
	
	// 3. 파라미터 순서 차이
	static void methodTest(double a, int b) {
		System.out.println("double + int 곱셈: " + (a * b));
	}
	
	// 4. 파라미터 타입 차이
	static int methodTest(int a, int b) {
		return (a > b) ? a : b;
	}
	
	// 5. 파라미터 타입차이
	static double methodTest(double a, double b) {
		return (a > b) ? a : b;
	}
}
