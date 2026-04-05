package chapter.chapter02_Operator;

import java.util.Scanner;

public class C019_Operator5 {
	public static void main(String[] args) {
		// 삼항 연산자( = 조건 연산자)
		// 조건식 ? 값1 : 값2
		
		int fatherAge = 45;
		int motherAge = 47;
		
		String result = fatherAge > motherAge
						?
							"아빠가 연상"
						:
							"엄마가 연상";
		System.out.println(result);
		
		// 입력을 통한 비교
		/*Scanner scan = new Scanner(System.in);
		int fatherAge1 = scan.nextInt();
		int motherAge1 = scan.nextInt();
		
		String result1 = fatherAge1 > motherAge1
						?
							"아빠가 연상"
						:
							"엄마가 연상";
		System.out.println(result1);*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아버지 나이: ");
		int fAge = scan.nextInt();
		System.out.println("어머니 나이: ");
		int mAge = scan.nextInt();
		
		String result2 = fAge > mAge
						?
							"아빠가 연상"
						:
							fAge == mAge
								?	"동갑"
								:
									"엄마가 연상";
		System.out.println(result2);
		
		
		
	}
}
