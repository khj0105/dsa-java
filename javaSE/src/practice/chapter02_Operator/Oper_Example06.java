package practice.chapter02_Operator;

import java.util.Scanner;

public class Oper_Example06 {
	public static void main(String[] args) {
		/*
			초(second)를 입력받아 시, 분, 초로 변환하여 출력하세요.

			출력예시
			초를 입력하세요: 3665
			1시간 1분 5초
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("초를 입력하세요: ");
		int sec = scan.nextInt();
		
		int hour = sec / 3600;
		int minute = sec % 3600 / 60;
		int second = sec % 60;
		
		System.out.println(hour + "시간 " + minute + "분 " + second + "초");
	}
}
