package chapter.chapter12_Generic;

/*
	[ 제네릭 ]
	1. 정의
	데이터 타입에 의존하지 않고, 클래스나 메서드에 사용할 타입을
	외부에서 지정할 수 있도록 하는 기능.
	즉, 특정(Specific) 타입을 미리 고정하지 않고,
	사용할 때 타입을 결정하는 일반(Generic) 타입 구조
	
	2. 장점
	- 타입 안정성 확보 (컴파일 시점에 오류 방지)
	- 코드 재사용성 증가, 유지보수성 향상
 */


class Coffee {
	@Override // toString()의 상위 Object를 Override
	public String toString() {
		return "커피";
	}
}
class Juice {
	@Override
	public String toString() {
		return "주스";
	}
}
// 1. Object 방식
class BeverageBox {
	private Object beverage;
	
	public BeverageBox(Object beverage) {
		this.beverage = beverage;
	}
	
	public Object getBeverage() {
		return beverage;
	}
}

// 2. Generic 사용
class GenericBox<T> {
	private T beverage;
	
	public GenericBox(T beverage) {
		this.beverage = beverage;
	}
	
	public T getBeverage() {
		return beverage;
	}
}

public class C099_Generic1 {
	public static void main(String[] args) {
		
		// 1. Object 사용 (모든 타입 가능)
		BeverageBox box1 = new BeverageBox(new Coffee());
		
		// 강제 형 변환 필요 (꺼낼 때 불편, 타입 안정성x)
		Coffee coffee1 = (Coffee) box1.getBeverage();
		System.out.println("Object 방식: " + coffee1);
		
		// 잘못된 형변환도 컴파일이 되버림. 실제는 오류남.
//		Juice juice1 = (Juice) box1.getBeverage();
		
		// 2. Generic 사용
		GenericBox<Coffee> box2 = new GenericBox<>(new Coffee());
		
		Coffee coffee2 = box2.getBeverage();
		System.out.println("Generic 방식: " + coffee2);
		
		// 컴파일 시점에서 막아 줌
//		Juice juice2 = box2.getBeverage();		// 오류
		
	}
}
