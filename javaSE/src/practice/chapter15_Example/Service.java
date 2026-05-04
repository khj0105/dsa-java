package practice.chapter15_Example;

import java.util.ArrayList;
import java.util.Scanner;


public class Service {
	private ArrayList<Student> studentList;
	private Scanner scan;
	
	
	public Service() {
		studentList = new ArrayList<>();
		scan = new Scanner(System.in);
	}
	
	public void mainMenu() {
		System.out.println("""
				\n[ DSA_ACADEMY ]
				1. 학생 등록
				2. 성적 수정
				3. 학생 조회
				4. 전체 조회
				5. 순위 조회
				0. 프로그램 종료
				""");
		System.out.print("선택 > ");
	}
	
	public void insertStudent() {
		System.out.println("\n[ 학생등록 ]");
		System.out.print("이름 입력 > " );
		String name = scan.nextLine();
		System.out.print("*Java : " );
		int java = scan.nextInt();
		System.out.print("*DB : ");
		int database = scan.nextInt();
		System.out.print("*WEB : ");
		int web = scan.nextInt();
		
		Student student = new Student(name, java, database, web);
		
		studentList.add(student);
		System.out.println("등록되었습니다.");
		
	}
	
	public void updateScore() {
		System.out.println("\n[ 성적수정 ]");
		System.out.print("학번 입력 > ");
		int stdNum = scan.nextInt();
		if (studentList.isEmpty()) {
			System.out.println("학생정보가 없습니다.");
		}
	}
	
	public void selectStudent() {
		System.out.println("\n[ 학생조회 ]");
		scan.nextLine();
		System.out.print("이름 입력 > ");
		int name = scan.nextInt();
		
		if (studentList.isEmpty()) {
			System.out.println("백점 학생의 정보가 없습니다.");
			return;
		}
		
		for (Student s : studentList) {
			if (s.getName().equals(name)) {
				System.out.println(s);
			}
		}
	}
	
	public void selectAll() {
		System.out.println("\n[ 전체조회 ]");
		if (studentList.isEmpty()) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
	}
	
	public void selectRank() {
		System.out.println("\n[ 성적 순위 결과 ]");
		
	}
}
