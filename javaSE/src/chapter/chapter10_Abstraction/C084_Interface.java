package chapter.chapter10_Abstraction;

/*
	[ 인터페이스 ] - interface
	인터페이스는 클래스가 구현해야 하는 기능의 규칙(설계도)이다.
	
	특징
	1. 객체를 직접 생성할 수 없다.
	2. implements 키워드로 구현한다.
	3. 인터페이스 변수는 자동으로 public static final 상수가 된다.
	4. 인터페이스 메서드는 자동으로 public abstract(추상) 메서드가 된다.
	5. java8부터는 default 메서드와 static 메서드를 사용할 수 있다.
		(구현부가 존재함)
	6. 인터페이스 타입으로 다형성을 표현할 수 있다. (타입 상속)
 */
interface Calc {
	// 인터페이스 변수는 상수
	double PI = 3.14;
	
	// 추상 메서드
	int add(int a, int b);
	int substract(int a, int b);
	
	// default 메서드, 인스턴스를 통해서만 호출 가능
	default void description() {
		System.out.println("계산기 인터페이스입니다.");
	}
	
	// static 메서드, 인스턴스 없이도 호출 가능
	static int total(int[] arr) {
		int sum = 0;
		for (int n : arr) {
			sum += n;
		}
		return sum;
	}
}

class BasicCalc implements Calc {
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	
	@Override
	public int substract(int a, int b) {
		return a - b;
	}
}
public class C084_Interface {
	public static void main(String[] args) {
		Calc calc = new BasicCalc();
		
		System.out.println(Calc.PI);
//		Calc.PI = 10.31;		// err
		System.out.println(calc.add(10,5));
		System.out.println(calc.substract(10,5));
		
//		Calc.description();		// err
		calc.description();		// default 메서드
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr));		// static 메서드
	}
	
	
}
