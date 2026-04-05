package chapter.chapter02_Operator;

public class C018_Operator4 {
	public static void main(String[] args) {
		// 논리 연산자
		// && : and 연산자
		// || : or 연산자
		
		int num1 = 10;
		int num2 = 20;
		boolean flag;
		
		// AND 연산자 : 둘 다 true 여야 true
		flag = (num1 > 0) && (num2 > 0);
		System.out.println(flag);
		flag = (num1 < 0) && (num2 > 0);
		System.out.println(flag);
		
		// OR 연산자 : 하나라도 true 면 true
		flag = (num1 < 0) || (num2 > 0);
		System.out.println(flag);
		
		// NOT 연산자 : true -> false, false -> true
		System.out.println("!flag = " + !flag);
		
		// 단락 평가
		int num = 10;
		int i = 2;
		
		// 앞이 false면 && 연산자는 뒤를 실행하지 않음
		boolean value = ((num = num + 10) < 10)
				&&
				((i = i + 2) < 10);
		System.out.println("value : " + value); // false
		System.out.println("num	  : " + num); // 20
		System.out.println("i     : " + i); // 2
		
		// 앞이 true면 || 연산자는 뒤는 실행하지 않음
		value = ((num += 10) > 10)
				||
				((i = i + 2) < 10);
		System.out.println("value : " + value);
		System.out.println("num	  : " + num);
		System.out.println("i     : " + i);
	}
}
