package practice.chapter15_Example;

public class Student3 {
	private static final String ACADEMY = "DSA"; // static은 단일값, 실행될때 자동으로 메모리에 올려줌, final는 상수
	private static final int NUMBER = 14;
	private static int serialNum = 20261001;
	private String name;
	private int stdNum;
	private int java;
	private int database;
	private int web;
	private int sum;
	private double avg;
	
	public Student3(String name, int java, int database, int web) {
		this.name = name;
		this.java = java;
		this.database = database;
		this.web = web;
		
		this.stdNum = serialNum++;
		
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
	public int getJava() {
		return java;
	}
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
	
	public void updateScore(int java, int database, int web) {
		this.java = java;
		this.database = database;
		this.web = web;
		
		this.sum = java + database + web;
		this.avg = (double) this.sum / 3;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Student3 student)) return false;
		return stdNum == student.getStdNum();
	}
	
	@Override
	public int hashCode() {
		return getStdNum();
	}
	
	@Override
	public String toString() {
		return String.format("[%s-%dth]" + "이름: %s, 학번: %d / 점수: JAVA(%3d), DB(%3d), WEB(%3d) / 총점(%3d), 평균(%5.1f)" ,
				ACADEMY, NUMBER, name, stdNum, java, database, web, sum, avg);
	}
	
}
