package practice.chapter15_Example;

public class Student2 {
	static final private String ACADEMY = "DSA";
	static final private int NUMBER = 14;
	static private int serialNum = 20261000;
	private String name;
	private int stdNum;
	private int java;
	private int database;
	private int web;
	private int sum;
	private double avg;
	
	public Student2(String name, int database, int web, int java) {
		this.name = name;
		this.database = database;
		this.web = web;
		this.java = java;
		
		this.stdNum = ++serialNum;
		
		this.sum = java + database + web;
		this.avg = (double)this.sum / 3;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getStdNum() {
		return stdNum;
	}
	public int getJava() { return java; }
	public int getDatabase() {
		return database;
	}
	public int getWeb() {
		return web;
	}
	public int getSum() {
		return sum;
	}
	public double getAvg() {
		return avg;
	}
	
	public void gradeModify(int java, int database, int web) {
		this.java = java;
		this.database = database;
		this.web = web;
		
		this.sum = java + database + web;
		this.avg = (double) this.sum / 3;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Student2 student)) return false;
		return stdNum == student.getStdNum();
	}
	
	@Override
	public int hashCode() {
		return stdNum;
	}
	
	@Override
	public String toString() {
		return String.format("[%s-%dth]" + "이름: %s, 학번: %d / 점수: JAVA(%3d), DB(%3d), WEB(%3d) / 총점(%3d), 평균(%.1f)" ,
				ACADEMY, NUMBER, name, stdNum, java, database, web, sum, avg);
	}
}
