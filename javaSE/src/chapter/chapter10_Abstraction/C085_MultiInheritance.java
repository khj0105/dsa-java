package chapter.chapter10_Abstraction;

/*
	[ 인터페이스 + 다중 구현 ]
	1. 클래스는 단일 상속만 가능하다.
	2. 인터페이스ㅡ는 여러개 구현 가능하다.
	3. 상속과 구현을 동시에 사용할 수 있다.
	4. 인터페이스끼리는 다중 상속이 가능하다.
 */

// 추상 클래스
abstract class Device {
	void powerOn() {
		System.out.println("전원을 켠다.");
	}
	void powerOff() {
		System.out.println("전원을 끈다.");
	}
}

// 일반 클래스
class Phone extends Device {
	void call() {
		System.out.println("전화를 건다.");
	}
	void receive() {
		System.out.println("전화를 받는다.");
	}
}

// 인터페이스
interface Camera {
	void takePicture();
}
interface Game {
	void playGame();
}

// 상속 + 다중 구현
class SmartPhone extends Phone implements Camera, Game {
	@Override
	public void takePicture() {
		System.out.println("찰칵, 사진을 찍는다.");
	}
	
	@Override
	public void playGame() {
		System.out.println("게임을 실행된다.");
	}
}

public class C085_MultiInheritance {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone();
		
		myPhone.powerOn();
		myPhone.call();
		myPhone.receive();
		myPhone.takePicture();
		myPhone.playGame();
		myPhone.powerOff();
		System.out.println("=============");
		
		// 타입의 다형성
		Camera cam = new SmartPhone();
		Game game = new SmartPhone();
		
		cam.takePicture();
		game.playGame();
	}
}

// 인터페이스
interface A {}
interface B {}

// 클래스 상속 + 인터페이스 다중 구현
class C {}
class D extends C implements A, B {}

// 인터페이스 다중 상속
interface E extends A, B {}