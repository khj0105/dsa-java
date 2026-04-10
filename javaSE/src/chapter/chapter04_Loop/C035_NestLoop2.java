package chapter.chapter04_Loop;

import java.util.Scanner;

public class C035_NestLoop2 {
	public static void main(String[] args) {
		
		// 숫자 맞추기
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			int num = (int) (Math.random() * 10) + 1; // 난수 발생 0.xxxx ~ 9.xxxx
			
			while (true) {
				System.out.print("숫자를 맞춰보세요(1~10): ");
				int input = scan.nextInt();
				
				if (input == num) {
					System.out.println("정답입니다!");
					break;
				} else if (input > num) {
					System.out.println("더 작은 숫자입니다.");
				} else {
					System.out.println("더 큰 숫자입니다.");
				}
			}
			
			System.out.print("다시 하시겠습니까? (y/n): ");
			String answer = scan.next();
			if (!answer.equals("y"))
				break;
		}
	}
}
