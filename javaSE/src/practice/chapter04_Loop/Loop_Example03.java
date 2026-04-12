package practice.chapter04_Loop;

import java.util.Scanner;

public class Loop_Example03 {
	public static void main(String[] args) {
/*
		합 구하기
		2개의 정수를 입력받아 입력받은 정수를
		포함한 사이값들의 총합을 구하시오
		단, 입력 순서에 상관없이 합을 구할 것.
		출력 결과:
			숫자 입력: 5		숫자 입력: 10
			숫자 입력: 10		숫자 입력: 5
			45				45
 */
		Scanner scan = new Scanner(System.in);
		
		/*int sum = 0;
		
		for(int i = 0; i < 2; i++) {
			System.out.print("숫자 입력: ");
			int num = scan.nextInt();
			sum = sum + num;
		}
		System.out.println(sum);*/
		
		System.out.println("숫자 입력: ");
		int start = scan.nextInt();
		System.out.println("숫자 입력: ");
		int end = scan.nextInt();
		
		int temp = 0;
		if (start > end) {
			temp = start;
			start = end;
			end = temp;
		}
		
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
