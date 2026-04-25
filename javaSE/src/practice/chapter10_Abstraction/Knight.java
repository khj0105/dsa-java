package practice.chapter10_Abstraction;

// 기사
public class Knight extends Novice implements Skill{
	
	// 명시적 생성자
	 public Knight(String name, int strength, int dexterity, int intelligence) {
		super(name, strength, dexterity, intelligence);
	}
	
	@Override
	public void attack() {
		System.out.println("배쉬 공격");;
	}
	
	@Override
	public String getJob() {
		return "기사";
	}
	
	@Override
	public void skill() {
		System.out.println("쇼크 스턴");
	}
}
