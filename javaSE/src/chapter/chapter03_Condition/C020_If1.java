package chapter.chapter03_Condition;

public class C020_If1 {
	public static void main(String[] args) {
		
		// 조건문 if - 조건식이 true 일 경우 실행
		int age = 15;
		
		// 1. if
		if (age >= 19) {
			System.out.println("성인입니다.");
		}
		
		// 2. if - else
		if (age >= 19) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("어린이입니다.");
		}
		
		// 3. if - else if - else
		if (age >= 19) {
			System.out.println("성인입니다.");
		} else if (age > 12) {	// 13 - 18
			System.out.println("청소년입니다.");
		} else {
			System.out.println("어린이입니다.");
		}
		
		// 4. if - else if
		if (age >= 19) {
			System.out.println("성인입니다.");
		} else if (age > 12) {
			System.out.println("청소년입니다.");
		} else if (age > 5) {
			System.out.println("유아입니다.");
		}
		
	}
}
