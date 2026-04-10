package chapter.chapter04_Loop;

import java.util.Scanner;

public class C034_DoWhile {
	public static void main(String[] args) {
		
		// do-while
		// 입력하는 값들의 합 구하기
		Scanner scan = new Scanner(System.in);
		int num;
		int sum = 0;
		
		do {
			System.out.print("숫자를 입력하세요(끝날 때 0): ");
			num = scan.nextInt();
			sum = sum + num;
		} while (num != 0);
		System.out.println("총 합계: " + sum);
	}
}
