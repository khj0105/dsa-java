package chapter.chapter05_Method;

import java.util.Scanner;

public class C043_MethodUsage {
	public static void main(String[] args) {
		// 메서드를 이용하여 전체 구구단 출력
		method();
		System.out.println("=======================");
		
		// 특정 단 출력
		methodEx();			// 전체 구구단 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.print("단: ");
		int num = scan.nextInt();
		methodEx(num);		// 특정 단 출력
	}
	
	public static void method() {
		for (int i = 2; i <= 9; i++) {
			System.out.println("* [" + i + "] 단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
			System.out.println();
		}
		return;		// 생략 가능 return 타입이 void일때
	}
	
	public static void methodEx() {
		for (int i = 2; i <= 9; i++) {
			System.out.println("* [" + i + "] 단");
			methodEx(i);
			System.out.println();
		}
	}
	
	public static void methodEx(int number) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(number + " X " + i + " = " + (number * i));
		}
	}
}
