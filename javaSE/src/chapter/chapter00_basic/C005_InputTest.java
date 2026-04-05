package chapter.chapter00_basic;

import java.util.Scanner;

public class C005_InputTest {
	
	public static void main(String[] args) {
		
		// 입력 테스트
		
		Scanner scan = new Scanner(System.in);
		
		// 숫자 입력
		System.out.println("정수 입력 : ");
		int num = scan.nextInt();
		System.out.println("출력 결과 : " + num);
		
		System.out.println("실수 입력 : ");
		double d = scan.nextDouble();
		System.out.println("출력 결과 : " + d);
		
		// 문자열 입력
		System.out.println("이름 입력 : ");
		String name = scan.next();
		System.out.println("출력 결과 : " + name);
		
	}
}
