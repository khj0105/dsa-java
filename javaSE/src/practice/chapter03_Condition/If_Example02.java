package practice.chapter03_Condition;

import java.util.Scanner;

public class If_Example02 {
	public static void main(String[] args) {
/*
		세개의 정수를 입력받아,
		If문을 활용하여 가장 큰 수를 출력한다.
		출력결과:
			숫자1: 3
			숫자2: 1
			숫자3: 2
			최대값: 3
 */
/*		Scanner scan = new Scanner(System.in);
		System.out.print("숫자1: ");
		int num1 = scan.nextInt();
		System.out.print("숫자2: ");
		int num2 = scan.nextInt();
		System.out.print("숫자3: ");
		int num3 = scan.nextInt();

		int max = 0;
		System.out.println("최대값: " + max);

		if (num1 <= 0 || num2 <= 0 || num3 <= 0) {
			System.out.println("입력한 값은 0보다 커야합니다.");
		} else if (num1 > num2 && num1 > num3) {
			System.out.println(max = num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(max = num2);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println(max = num3);
		}
*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자1: ");
		int a = scan.nextInt();
		System.out.print("숫자2: ");
		int b = scan.nextInt();
		System.out.print("숫자3: ");
		int c = scan.nextInt();
		
		int max = a;
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		System.out.println("최대값: " + max);
		
	}
}
