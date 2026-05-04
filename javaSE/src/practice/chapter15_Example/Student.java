package practice.chapter15_Example;

import java.util.Objects;

public class Student {
	
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
	
	public Student(String name, int database, int web, int java) {
		this.name = name;
		this.database = database;
		this.web = web;
		this.java = java;
	}
	
	public Student(int stdNum) {
		stdNum = serialNum;
		stdNum++;
	}
	
	public Student(int sum, double avg) {
		this.sum = java + database + web;
		this.avg = (double)sum / 3;
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
		
		int sum = java + database + web;
		double avg = (double) sum / 3;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Student)) return false;
		Student student = (Student)o;
		return Objects.equals(stdNum, student.stdNum);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(stdNum);
	}
	
	@Override
	public String toString() {
		return String.format("[DSA-14th]" + "이름: %s, 학번: %d, +  /  + 점수: JAVA(%d), DB( %d), WEB( %d) +  /  + 총점(%d), 평균( %f)" ,
				this.name, this.stdNum, this.java, this.database, this.web, this.sum, this.avg);
	}
	
}
