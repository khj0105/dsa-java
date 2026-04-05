package chapter.chapter02_Operator;

public class C016_Operator2 {
	public static void main(String[] args) {
		// 관계 연산자 true, false로 출력
		int num = 10;
		
		System.out.println("num > 3 : " + (num > 3));
		System.out.println("num < 3 : " + (num < 3));
		System.out.println("num >= 3 : " + (num >= 3));
		System.out.println("num <= 3 : " + (num <= 3));
		System.out.println("num == 3 : " + (num == 3));
		System.out.println("num != 3 : " + (num != 3));
		
		// 복합 관계 연산자
		System.out.println("=== 복합 관계 연산자 ===");
		
		int num2 = 3;
		
		num2 += 3;;		// num2 = num2 + 3
		System.out.println("num2 += 3 -> " + num2);
		num2 -= 3;		// num2 = num2 - 3
		System.out.println("num2 -= 3 -> " + num2);
		num2 *= 3;		// num2 = num2 * 3
		System.out.println("num2 *= 3 -> " + num2);
		num2 /= 3;		// num2 = num2 / 3
		System.out.println("num2 /= 3 -> " + num2);
		num2 %= 3;		// num2 = num2 % 3
		System.out.println("num2 &= 3 -> " + num2);
	}
}
