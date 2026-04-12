package practice.chapter03_Condition;

import java.util.Scanner;

public class Switch_Example02 {
	public static void main(String[] args) {
/*
		사칙연산 계산기
		
		점수 2개와 연산자(+, -, *, /)를 입력받아 계산 결과를 출력하세요.
		단, 나눗셈에서 0으로 나누는 경우 오류 메시지를 출력합니다.
		
		실행 예
		연산자(+, -, *, /): +
		정수1 입력: 3
		정수2 입력: 10
		결과: 13
 */
		
/*
		// 내가 짠 것
		Scanner scan = new Scanner(System.in);
		
		System.out.println("연산자(+,-,*,/): ");
		String op = scan.next();
		System.out.println("정수1 입력: ");
		int num1 = scan.nextInt();
		System.out.println("정수2 입력: ");
		int num2 = scan.nextInt();
		
		String result = "";
		switch(op){
			case "+": result = num1 + num2 break;
			case "-": result = num1 - num2 break;
			case "*": result = num1 * num2 break;
			case "/": result = num1 / num2 break;
		}
		System.out.println("결과: " + result);*/

/*
		// 제미나이
		Scanner scan = new Scanner(System.in);

		System.out.print("연산자(+, -, *, /): ");
		String op = scan.next();
		System.out.print("정수1 입력: ");
		int num1 = scan.nextInt();
		System.out.print("정수2 입력: ");
		int num2 = scan.nextInt();
		
		double result = 0;
		boolean isError = false;
		
		switch(op){
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				if (num2 == 0) {
					System.out.println("오류: 0으로 나눌 수 없습니다.");
					isError = true;
				} else {
					result = (double) num1 / num2;
				}
				break;
			default:
				System.out.println("잘못된 연산자입니다.");
				isError = true;
		}
		
		if (!isError) {
			System.out.println("결과: " + result);
		}
 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연산자(+,-,*,/): ");
		String op = scan.next();
		System.out.print("정수1 입력: ");
		int a = scan.nextInt();
		System.out.print("정수2 입력: ");
		int b = scan.nextInt();
		
		// switch 표현식
		switch (op) {
			case "+" -> System.out.println("결과: " + (a + b));
			case "-" -> System.out.println("결과: " + (a - b));
			case "*" -> System.out.println("결과: " + (a * b));
			case "/" -> {
				if (b == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
					break;
				}
				System.out.println("결과: " + ((double) a / b));
			}
			default -> System.out.println("잘못 입력하셨습니다.");
		}
	}
}
