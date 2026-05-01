package practice.chapter10_Abstraction;

// 도적
public class Thief extends Novice implements Skill {
	public Thief(String name, int str, int dex, int intel) {
		super(name, str, dex, intel);
	}
	@Override
	public void attack() { System.out.println("더블 스태브"); }
	@Override
	public String getJob() { return "도적"; }
	@Override
	public void skill() { System.out.println("헤이스트"); }
}
