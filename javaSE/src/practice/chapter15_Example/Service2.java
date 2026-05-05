package practice.chapter15_Example;

import java.util.ArrayList;
import java.util.Scanner;

public class Service2 {
	private ArrayList<Student2> studentList;
	private Scanner scan;
	
	
	public Service2() {
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
		scan.nextLine();
		System.out.print("이름 입력 > " );
		String name = scan.nextLine();
		
		int java, database, web;
		
		while (true) {
			System.out.print("*Java : " );
			java = scan.nextInt();
			System.out.print("*DB : ");
			database = scan.nextInt();
			System.out.print("*WEB : ");
			web = scan.nextInt();
			
			if ((java >= 0 && java <= 100) &&
				(database >= 0 && database <= 100) &&
				(web >= 0 && web <= 100)) {
				break;
			}
			
			System.out.println("점수는 0~100 점 이내로 입력하세요.");
		}
		
		
		Student2 student = new Student2(name, java, database, web);
		
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
