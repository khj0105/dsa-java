package chapter.chapter01_Data;

public class C007_Constant {
	
	public static void main(String[] args) {
	
	
/*
		[상수]
		1. 한번 값이 저장되면 변경할 수 없는 변수
		2. final 키워드를 사용하여 선언
		3. 보통 이름을 "대문자 + 언더스코어(_)" 로 작성
			(일반 변수와 구분하기 위해서)
		ex. PI, MAX_SIZE, TAX_RATE
 */
		
		// 변수 초기화
		final double a = 3.14;
		System.out.println(a);
//		a = 10.26;		// 변경 불과
		
		final double RATE = 3.28;		// 이자율
		int deposit = 10000;
		
		System.out.println("이자율: " + RATE + "%");
		System.out.println("1년 후 이자: " + deposit * RATE / 100 + "원");
		
/*
		[ 리터럴 ]
		프로그램에서 직접 작성한 "값 자체"
		변수에 저장되거나 수식에 바로 사용됨
 */
		final double PI = 3.14;		// PI: 상수 , 3.14: 리터럴
		int number = 10000;			// 10000: 리터럴
		String name = "홍길동";		// "홍길동": 리터럴
	}
}
