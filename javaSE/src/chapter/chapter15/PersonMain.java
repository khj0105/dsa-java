package chapter.chapter15;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("김개똥", 25);
		p1.setName("이말동") ;
		p1.setAge(25);
		//System.out.println("이름: " + p1.name + ", 나이: " + p1.age);
		// System.out.println("이름: " + p1.getName() + ", 나이: " + p1.getAge());
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.equals(p2));
		
		Student student = new Student("이말똥", 38); // 코드가 따로 없어도 부모 요소를 가지고 있어 자식 코드가 실행됨
		System.out.println(student);
	}
}
