package chapter.chapter15;

import java.util.Objects;

//public abstract class Person
public class Person {// 추상클래스는 하나이상의 추상 메서드가 포함됨, 미완성이기 때문에 객체로 만들수 없음. -> 완성은 상속으로 해결
	String name; // 이름 필드
	private int age;	 // 나이 필드
	
	// 추상 메서드 (미완성된 메서드)
//	public  void update(String name, int age);
//	public abstract void update(String name, int age); // 미완성된 메서드 {}가 없음
	
	public Person(String name, int age) {
		// this(age);
		this.age = age;
		this.name = name;
		
	}
//
//	public Person(int age) {
//		this.age = age;
//	}
//
//	public static void main(String[] args) {
//		Person p1 = new Person("홍길동", 20);
//		System.out.println("이름: " + p1.name + ", 나이: " + p1.age);
//	}
	
	public void setAge(int age) {
		if (age < 0 || age > 100) {
			System.out.println("나이 정보가 잘못됐습니다.");
			return;
		}
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String setName(String name) {
		return this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return age == person.age && Objects.equals(name, person.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	
	@Override // 부모 클래스에 있는 메서드를 자식 클래스에서 재정의
	public String toString() {
		return """
				이름: %s, 나이: %d
				""".formatted(this.name, this.age);
	}
}
