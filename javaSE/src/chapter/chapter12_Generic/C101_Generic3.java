package chapter.chapter12_Generic;

class Fruit {
	@Override
	public String toString() { return "과일"; }
}
class Apple extends Fruit {
	@Override
	public String toString() { return "사과"; }
}
class Banana extends Fruit {
	@Override
	public String toString() { return "바나나"; }
}

class Grape {
	@Override
	public String toString() { return "포도";}
}

class FruitBox<T> {
	private T item;
	public void setItem(T item) { this.item = item; }
	public T getItem() { return item; }
}

// 제네릭 2개
class MixedFruitBox<T, U> {
	private T fruit1;
	private U fruit2;
	
	public void add(T fruit1, U fruit2) {
		this.fruit1 = fruit1;
		this.fruit2 = fruit2;
	}
	
	public void printItems() {
		System.out.println(fruit1 + ", " + fruit2);
	}
}

public class C101_Generic3 {
	public static void main(String[] args) {
		// 1. 제네릭에도 다형성이 적용됨
		FruitBox<Fruit> box = new FruitBox<>();
		
		box.setItem(new Fruit());
		System.out.println(box.getItem());
		
		box.setItem(new Apple());
		System.out.println(box.getItem());
		
		box.setItem(new Banana());
		System.out.println(box.getItem());
		
//		box.setItem(new Grape());		// err
		
		// 2. 복수 제네릭
		MixedFruitBox<Apple, Banana> pair1 = new MixedFruitBox<>();
		pair1.add(new Apple(), new Banana());
		pair1.printItems();
	}
}
