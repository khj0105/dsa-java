package practice.chapter00_Basic;

import java.util.Scanner;

public class Basic_Example01 {
	
	public static void main(String[] args) {
		
		// 스캐너 클래스 불러오기
		Scanner scan = new Scanner(System.in);
		
		// 정수 입력 받을 변수 선언
		int num;
		System.out.print("정수를 입력해 주세요: ");
		
		// 입력값으로 초기화
		num = scan.nextInt();
		System.out.println("입력한 정수: " + num);
		
		// 실수 입력 받을 변수 초기화
		double dNum = 0.0;
		System.out.println("실수를 입력해 주세요: ");
		dNum = scan.nextDouble();
		System.out.println("입력한 실수: " + dNum);
		
		scan.nextLine();	// 버퍼 제거
		
		// 문자열을 입력 받을 변수 초기화
		System.out.print("문자열을 입력해 주세요: ");
		String text = scan.nextLine();
		System.out.println("입력한 문자열: " + text);
	}
}
