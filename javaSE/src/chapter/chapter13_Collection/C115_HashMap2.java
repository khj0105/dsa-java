package chapter.chapter13_Collection;

import java.util.HashMap;

class Human {
	int age;
	String name;
	
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Human) {
			Human other = (Human) obj;
			return age == other.age && name.equals(other.name);
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.length() + age;
	}
}
public class C115_HashMap2 {
	public static void main(String[] args) {
		HashMap<Human, Integer> donate = new HashMap<>();
		donate.put(new Human(42, "김기남"), 10000);
		donate.put(new Human(24, "박수빈"), 20000);
		donate.put(new Human(20, "박수현"), 5000);
		donate.put(new Human(11, "최상미"), 8000);
		
		// null 이유 => HashMap에 저장된 Human(20, "박수현") 객체와
		// park 객체의 주소가 다르다.
		// 그러므로 Human 클래스에 동일함의 기준인
		// equals & hashCode 를 재정의 하여 동일 객체 비교를 정의한다.
		Human park = new Human(20, "박수현");
		System.out.println(park.name + "씨의 기부금 = " + donate.get(park));
	}
}
