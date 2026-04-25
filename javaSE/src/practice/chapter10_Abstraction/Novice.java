package practice.chapter10_Abstraction;

//평민
public class Novice {
	
	// 멤버 변수
	private String name;		// 캐릭터 이름
	private int strength;		// 힘 스탯
	private int dexterity;		// 민첩 스탯
	private int intelligence;	// 지능 스탯
	
	// 기본 생성자
	public Novice() {}
	
	// 명시적 생성자
	public Novice(String name, int strength, int dexterity, int intelligence) {
		this.name = name;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
	}
	
	// 멤버 메서드
	public void attack() {
		System.out.println("기본 공격");
	}
	
	public String getJob() {
		return "평민";
	}
	
	// getter / setter
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getStrength() {
		return strength;
	}
	public int getDexterity() {
		return dexterity;
	}
	public int getIntelligence() {
		return intelligence;
	}
}
