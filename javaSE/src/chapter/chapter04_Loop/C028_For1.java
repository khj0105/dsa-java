package chapter.chapter04_Loop;

public class C028_For1 {
	public static void main(String[] args) {
		
		int a = 10;
		
		// for : (초기화식; 조건식; 증감식) { }
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "번 학생 서억 처리");
//			System.out.println(a);		// 전역변수 사용 가능
		}
		
		// 제어변수 i는 지역변수이므로 밖에서 사용 불가
//		System.out.println(i);		// err
		
		// 1~100 합
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("1~100 합 = " + sum);
		
		// 1-100 짝수들의 합
		// 1.
		int sum2 = 0;
		for (int i = 0; i <= 100; i = i + 2){
			sum2 += i;
		}
		System.out.println("짝수들의 합1: " + sum2);
		
		// 2.
		int sum3 = 0;
		for (int i = 0; i <= 100; i++){
			if (i % 2 != 0)
				continue;
			sum3 += i;
		}
		System.out.println("짝수들의 합2: " + sum3);
		
		int sum4 = 0;
		for (int i = 0; i <= 100; i++){
			if (i % 2 == 0)
				continue;
			sum4 += i;
		}
		System.out.println("홀수들의 합: " + sum4);
	}
}
