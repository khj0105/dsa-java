package chapter.chapter03_Condition;

public class C025_Switch3 {
	public static void main(String[] args) {
		
		// 1. switch문에서 String 사용
		String country = "China";
		
		switch (country) {
			case "Korea":
				System.out.println("Seoul");
				break;
			case "China":
			System.out.println("Beijing");
				break;
			case "Japan":
				System.out.println("Tokyo");
				break;
			default:
				System.out.println("해당 국가의 수도 정보가 없습니다.");
				break;
		}
		
		// 2. String 비교
		// ==		: 참조(주소) 비교
		// equals() : 문자열 내용 비교
		String a = "안녕";
		String b = "안녕";
		
		System.out.println("a == b : " + (a == b));
		
		String c = new String( "안녕");
		System.out.println("a == c : " + (a == c));
		
		System.out.println("a.equals(c) : " + a.equals(c));
	}
}
