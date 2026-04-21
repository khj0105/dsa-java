package chapter.chapter09_Polymorphism;

/*
	[ instanceof 연산자 ]
	참조변수가 특정 타입의 인스턴스를 참조하고 있는지 확인하는 연산자
		참조변수 instanceof 클래스명
	결과값
		true: 해당 타입의 인스턴스이거나, 그 자식 타입의 인스턴스인 경우
		false: 해당 타입이 아닌 경우
 */



class Dog extends Animal {
	void bark() {
		System.out.println("멍멍");
	}
}
class Dove extends Animal {
	void fly() {
		System.out.println("퍼득퍼득");
	}
}
public class C080_InstanceOf {
	public static void main(String[] args) {
		// 1. 자신의 타입으로 객체 생성
		Dog dog1 = new Dog();
		dog1.move();
		dog1.bark();
		System.out.println();
		
		// 2. 부모 타입으로 업캐스팅
		Animal dog2 = new Dog();
		dog2.move();
//		dog.bark;		// 오류
		System.out.println();
		
		// 3. 다른 자식 객체도 부모 타입으로 참조 가능
		Animal dove = new Dove();
		dove.move();
//		dove.fly();		// 오류
		System.out.println();
		
		// 4. 순수 부모 객체
		Animal animal = new Animal();
		animal.move();
		System.out.println();
		
		testAnimal(dog1);
		testAnimal(dog2);
		testAnimal(dove);
		testAnimal(animal);
		
		System.out.println("=== instanceof 결과 확인 ===");
		System.out.println("dog1 instanceof Animal: " + (dog1 instanceof Animal));
		System.out.println("dog2 instanceof Animal: " + (dog2 instanceof Animal));
		System.out.println("dog2 instanceof Dog: " + (dog2 instanceof Dog));
		System.out.println("dove instanceof Animal: " + (dove instanceof Dove));
		System.out.println("dove instanceof Dove: " + (dove instanceof Dove));
		System.out.println("animal instanceof Dog: " + (animal instanceof Dog));
		System.out.println("animal instanceof Dove: " + (animal instanceof Dove));
	}
	
	static void testAnimal(Animal animal) {
		System.out.println("[testAnimal 실행]");
		
		animal.move();
		
		// Dog이 아닌 인스턴스를 집어넣으면 에러가 남
//		Dog mydog = (Dog) animal;
//		mydog.bark();
		
		if (animal instanceof Dog) {
			Dog myDog = (Dog) animal;
			myDog.bark();
		}
		// 패턴 매칭
		else if (animal instanceof Dove myDove) {
			myDove.fly();
//		else if (animal instanceof Dove myDove) {
//			myDove = (Dove) animal;
//			myDove.fly();
		} else {
			System.out.println("일반 Animal");
		}
	}
}
