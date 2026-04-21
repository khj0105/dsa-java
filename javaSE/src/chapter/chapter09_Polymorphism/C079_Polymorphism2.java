package chapter.chapter09_Polymorphism;



class Rabbit extends Animal {
	@Override
	void move() {
		System.out.println("껑충");
	}
}
class Cat extends Animal {
	@Override
	void move() {
		System.out.println("사뿐");
	}
}

public class C079_Polymorphism2 {
	public static void main(String[] args) {
		Animal animal1 = new Rabbit();		// 업캐스팅 (자동 형변환)
		Animal animal2 = new Cat();
		
		animal1.move();
		animal2.move();
		System.out.println("===============");
		Animal[] animals = { new Rabbit(), new Cat(), new Rabbit()};
		
		for (Animal a : animals) {
			a.move();
		}
	}
}
