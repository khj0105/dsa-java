package practice.chapter01_Data;

import java.util.Scanner;

public class Data_Example02 {
	public static void main(String[] args) {
		/*
			조건
			1. 두 개의 정수를 입력받는다.
			2. 형변환을 사용하여 결과가 실수(double) 로 나오도록 한다.
			
			출력 예시
			첫 번째 숫자 : 7
			두 번째 숫자 : 2
			나눗셈 결과 : 3.5
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자: ");
		int num1 = scan.nextInt();
		System.out.println("두 번째 숫자: ");
		int num2 = scan.nextInt();
		
		double result = (double)num1/num2; //***
		System.out.println("나눗셈 결과: " + result);
		
	}
}
