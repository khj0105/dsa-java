package chapter.chapter01_Data;

public class C014_ArithmeticCasting {
	public static void main(String[] args) {
/*
		[ 산술 형 변환 (Arithmetic Casting) ]
		연산할 때 자동으로 타입이 변환되는 현상
		
		규칙
		1. byte, short, char 는 연산 시 int로 변환
		2. 서로 다른 타입끼리 연산하면 더 큰 타입으로 변환
 */
		// char + char -> int
		char ch1 = 'A';
		char ch2 = 'B';
		int result = ch1 + ch2;
		
		System.out.println("result : " + result);
		
		// int + double -> double
		int iNum = 5;
		double dNum = 5.8;
		double result2 = iNum + dNum;
		System.out.println("result2 : " + result2);
		
		// 나눗셈 ( / , % )
		int x = 7;
		int y = 2;
		double result3 = (double) x / y;
		System.out.println("result3 : " + result3);
	}
}
