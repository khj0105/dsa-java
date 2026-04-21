package chapter.chapter08_Inheritance;

/*
	[ final ]
	1. final 변수에 붙임면
		값 변경 불가 (상수)
	2. final 메서드에 붙이면
		자식클래스에서 오버라이딩 불가
	3. final 클래스
		상속 불가
 */
final class FinalVehicle {
	void info() {
		System.out.println("나는 final 클래스");
	}
}
class Vehicle {
	final int MAX_SPEED = 120;
	
	final void move() {
		System.out.println("Vehicle 이동");
	}
}

class Car extends Vehicle {
	void drive() {
		System.out.println("Car 운전");
	}
	
	// final 메서드는 오버라이딩 불가
/*	@Override
	void move() {
		System.out.println("재정의");
	}*/
}

//class Truck extends FinalVehicle {} // 오류 (상속 불가)
public class C074_Final {
	public static void main(String[] args) {
		Car c = new Car();
		
		System.out.println("MAX_SPEED: " + c.MAX_SPEED);
		
		c.move();
		c.drive();
		
//		c.MAX_SPEED = 200;	// 오류
	}
}
