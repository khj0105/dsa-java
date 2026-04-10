package chapter.chapter05_Method;

public class C038_Method1 {
	public static void main(String[] args) {
/*
		[ 메서드 ]
		메서드를 호출할 때는 메서드가 정의된 형식에 맞춰 호출해야 한다
		1. 매개변수(parameter)가 없다면 값 없이 호출
		2. 매개변수가 있다면 자료형, 개수, 순서에 맞게 값을 전달해야 함
		3. 반환값이 있는 메서드는 하나의 값처럼 사용 가능
		
		- 구조
		접근제어자 [static] 반환타입 메서드명(자료형 변수명, 자료형 변수명) {
			실행문
			return 값;
		}
 */
		
		// 1. 메서드를 사용하지 않는 경우
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10 합 " + sum);
		
		
		// 2. 메서드 호출
		System.out.println("=== 메서드 호출 ===");
		System.out.println("1 - 10 합= " + calcSum(1, 10));
		System.out.println("15 - 100 합= " + calcSum(15, 100));
		System.out.println("50 - 200 합= " + calcSum(50, 200));
	}
	
	public static int calcSum(int from, int to) {
		int sum = 0;
		for (int i = from; i <= to; i++) {
			sum += i;
		}
		return sum;		// 결과를 호출한 곳으로 반환
	}
}
