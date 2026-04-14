package chapter.chapter06_Class;

class Human {
	int age;
	String name;
	
	void intro() {
		System.out.println("안녕 나는 " + age + "살 " + name + "이야");
	}
	void birthday() {
		age++;
		System.out.println(name + "의 나이가 한 살 증가했습니다.");
	}
}

public class C046_Basic2 {
	public static void main(String[] args) {
		Human kim = new Human();
		kim.name = "강감찬";
		kim.age = 29;
		kim.intro();
		kim.birthday();
		kim.intro();
		
		System.out.println();
		Human lee = new Human();
		lee.name ="신사임당";
		lee.age = 50;
		lee.intro();
	}
}
