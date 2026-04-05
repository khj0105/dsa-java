package chapter.chapter02_Operator; // 폴더명

public class C015_Operator1 {		// 클래스명
	public static void main(String[] args) {
/*
		[ 산술 연산자 ]
		+, - , *, / , %
 */
		int a = 6, b = 4;
		
		System.out.println("=== 산술 연산자 ===");
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (a / b));
		System.out.println(a + " / " + b + " = " + ((double)a / b));
		
		// 나머지 연산자 - %
		System.out.println("=== % 연산자 ===");
		System.out.println("6 % 4 = " + (6 % 4));
		System.out.println("7 % 3 = " + (7 % 3));
		
		// 짝수 / 홀수 판단
		int num = 14;
		System.out.println("14 % 2 = " + (num % 2));	// 짝수
		num = 7;
		System.out.println("15 % 2 = " + (num % 2));	// 홀수
		
		// 대입 연산자
		int x, y, z, sum;
		x = 3;
		y = 4;
		z = 5;
		sum = x + y + z;
		System.out.println("sum = " + sum);
	}
}
