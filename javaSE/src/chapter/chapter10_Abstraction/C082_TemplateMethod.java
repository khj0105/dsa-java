package chapter.chapter10_Abstraction;


abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	private void startCar() {
		System.out.println("시동을 켭니다.");
	}
	private void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// template 메서드
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}

class AICAR extends Car {
	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 알아서 방향을 전환합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");
	}
}

class ManualCar extends Car {
	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("브레이크로 정지합니다.");
	}
}
public class C082_TemplateMethod {
	public static void main(String[] args) {
		
		// 추상클래스를 이용한 탬플릿 메서드
		System.out.println("=== 자율 주행하는 자동차 ===");
		Car myCar = new AICAR();
		myCar.run();
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		Car hisCar = new ManualCar();
		hisCar.run();
	}
}

abstract class AA {
	abstract void methodA();
	abstract void methodB();
}
abstract class BB extends AA {
	@Override
	void methodA(){ }
}
class CC extends BB {
	@Override
	void methodB() {}
}
abstract class DD {
	// 추상 메서드가 없어도 됨
}