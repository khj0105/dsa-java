package practice.chapter02_Operator;

import java.util.Scanner;

public class Oper_Example03 {
	public static void main(String[] args) {
		/*
			각 자리수의 합 구하기
			
			출력예시
			0~999 사이의 정수를 입력하세요
			315
			각 자리수의 합: 9
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("0~999 사이의 정수를 입력하세요");
		int num = scan.nextInt();
		
		int hundred = num / 100;		// 백의 자리
		int ten	    = (num % 100) / 10; // 십의 자리
		int one		= num % 10;			// 일의 자리
		
		int sum = hundred + ten + one;
		System.out.println("각 자리수의 합: " + sum);
	}
}
