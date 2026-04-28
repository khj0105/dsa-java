package chapter.chapter13_Collection;

/*
	[ Comparable ]
	- 객체를 비교하여 정렬 기준을 정의하는 인터페이스
	- 클래스 내부에서 정렬 기준을 정의한다.
	- TreeSet, TreeMap 에서 정렬을 위해 사용된다.
	
	메서드
		compareTo(T o)
		
	반환값 의미
		양수		:	현재 객체 > 비교 객체
		0		:	같은 개개체
		음수		:	현재 객체 < 비교 객체
 */

import java.util.Set;
import java.util.TreeSet;

class Member implements Comparable<Member>{
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "(" + age + ")";
	}
	
	@Override
	public int compareTo(Member m) {
		
		// 1차 정렬: 이름
		int result = this.name.compareTo(m.name);
//		int result = this.name.compareTo(m.name) * -1;	// 역순
		
		// 이름이 같으면 나이로 정렬
		if (result == 0) {
			return this.age - m.age;
		}
		
		return result;
	}
}

public class C117_Comparable {
	public static void main(String[] args) {
		Set<Member> set = new TreeSet<>();
		set.add(new Member("홍길동", 20));
		set.add(new Member("강감찬", 25));
		set.add(new Member("이순신", 35));
		set.add(new Member("홍길동", 25));
		
		for (Member m : set) {
			System.out.println(m);
		}
	}
}
