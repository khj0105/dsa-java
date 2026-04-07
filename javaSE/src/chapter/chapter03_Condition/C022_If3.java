package chapter.chapter03_Condition;

public class C022_If3 {
	public static void main(String[] args) {
		// if 중첩
		// if문 안에 또 다른 if문이 들어가는 구조
		
		int age = 25;
		boolean man = true;
		
		if (age >= 19) {		// 성인 여부 판단
			
			if (man) {			// 성별 판단
				System.out.println("성인 남성: 25000원");
			} else {
				System.out.println("성인 여성: 21000원");
			}
		} else {
			System.out.println("청소년: 15000원");
		}
		
		
	}
}
