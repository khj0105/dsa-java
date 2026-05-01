package practice.chapter02_Operator;

import java.util.Scanner;

public class Oper_Example07 {
	public static void main(String[] args) {
		/*
			정수를 입력받아 짝수인지 홀수인지 출력하세요.

			hint : 삼항연산자

			출력예시
			정수 입력: 7
			결과: 홀수
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = scan.nextInt();
		
		String result = (num % 2 == 0) ? "짝수" : "홀수";
		
		System.out.println("결과: " + result);
	}
}
