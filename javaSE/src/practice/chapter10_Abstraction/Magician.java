package practice.chapter10_Abstraction;

// 마법사
public class Magician extends Novice implements Skill {
	public Magician(String name, int str, int dex, int intel) {
		super(name, str, dex, intel);
	}
	@Override
	public void attack() { System.out.println("매직 애로우"); }
	
	@Override
	public String getJob() { return "마법사"; }
	
	@Override
	public void skill() { System.out.println("메테오"); }
}
