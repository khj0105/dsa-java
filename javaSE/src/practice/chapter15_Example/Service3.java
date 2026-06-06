package practice.chapter15_Example;

import java.util.ArrayList;
import java.util.Scanner;

public class Service3 {// 비즈니스 로직
	private ArrayList<Student3> studentList;
	private Scanner scan;
	
	
	public Service3() {
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
		
		int java, database, web;
		
		while (true) {
			System.out.print("*Java : " );
			java = scan.nextInt();
			System.out.print("*DB 	: ");
			database = scan.nextInt();
			System.out.print("*WEB 	: ");
			web = scan.nextInt();
			
			if ((java >= 0 && java <= 100) &&
					(database >= 0 && database <= 100) &&
					(web >= 0 && web <= 100)) {
				break;
			}
			
			System.out.println("점수는 0~100 점 이내로 입력하세요.");
		}
		
		
		Student3 student = new Student3(name, java, database, web);
		
		studentList.add(student);
		System.out.println("등록되었습니다.");
		
		scan.nextLine(); // [추가] 점수 입력 후 남은 유령 엔터를 메서드가 끝나기 전에 완벽히 청소!
	}
	
	public void updateScore() {
		System.out.println("\n[ 성적수정 ]");
		System.out.print("학번 입력 > ");
		int stdNum = scan.nextInt();

		// 1. 학번과 일치하는 학생 찾기
		Student3 targetStudent = null;
		for (Student3 s : studentList) {
			if (s.getStdNum() == stdNum) {
				targetStudent = s;
				break;
			}
		}

		// 2. 학생 존재 여부 체크
		if (targetStudent == null) {
			System.out.println("학생정보가 없습니다.");
			return; // 메서드 종료
		}

		// 3. 점수 입력 및 유효성 검사 (반복)
		int java, database, web;
		while(true) {
			System.out.print("*Java : ");
			java = scan.nextInt();
			System.out.print("*DB : ");
			database = scan.nextInt();
			System.out.print("*WEB : ");
			web = scan.nextInt();

			// 0~100점 사이인지 확인
			if ((java >= 0 && java <= 100) &&
					(database >= 0 && database <= 100) &&
					(web >= 0 && web <= 100)) {
				break; // 올바른 입력이면 반복문 탈출
			}
			System.out.println("점수는 0~100점 이내로 입력하세요.");
		}

		// 4. 성적 수정 반영 (기존에 만들어둔 gradeModify 활용)
		targetStudent.updateScore(java, database, web);
		System.out.println("수정되었습니다.");
		
		scan.nextLine(); // [추가] 여기서도 마지막에 남은 유령 엔터를 깨끗이 청소!
	}

	public void selectStudent() {
		System.out.println("\n[ 학생조회 ]");
		
		System.out.print("이름 입력 > ");
		String searchName = scan.nextLine(); // 이름을 받아야 하므로 String

//		// 1. 리스트가 비어있는지 먼저 확인
//		if (studentList.isEmpty()) {
//			System.out.println("등록된 학생의 정보가 없습니다.");
//			return;
//		}

		// 2. 검색 결과가 있는지 확인하기 위한 변수
		boolean isExist = false;

		// 3. 리스트를 돌면서 이름이 일치하는 모든 학생 출력 (동명이인 포함)
		for (Student3 s : studentList) {
			if (s.getName().equals(searchName)) {
				System.out.println(s);
				isExist = true; // 일치하는 학생을 한 명이라도 찾으면 true로 변경
			}
		}

		// 4. 반복문이 끝났는데도 한 명도 못 찾았다면 안내 메시지 출력
		if (!isExist) {
			System.out.println(searchName + " 학생의 정보가 없습니다.");
		}
	}

	public void selectAll() {
		System.out.println("\n[ 전체조회 ]");
		
		if (studentList.isEmpty()) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		
		studentList.sort((s1, s2) -> {
			int nameCompare = s1.getName().compareTo(s2.getName());
			
			if (nameCompare != 0) {
				return nameCompare;
			}
			
			return Integer.compare(s2.getStdNum(), s1.getStdNum());
		});
		
		for (Student3 student : studentList) {
			System.out.println(student);
		}
	}

	public void selectRank() {
		System.out.println("\n[ 성적 순위 결과 ]");
		
		if (studentList.isEmpty()) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		
		// 2. 총점(Sum) 기준 내림차순 정렬 (s2와 s1의 순서를 바꾸어 큰 값이 앞으로 오게 함)
		studentList.sort((s1, s2) -> Integer.compare(s2.getSum(), s1.getSum()));
		
		int rank = 1; // 화면에 표시할 현재 등수
		int count = 0; // 루프가 돌면서 누적된 실제 인원수
		int prevSum = -1; // 이전 학생의 총점을 기억할 변수 (초기값은 나올 수 없는 점수인 -1)
		
		for (Student3 student : studentList) {
			count++;// 학생 한 명을 검사할 때마다 실제 인원수 1씩 증가
			
			// 첫 번째 학생이 아니면서, 이전 학생의 총점과 현재 학생의 총점이 다르다면
			if (prevSum != -1 && student.getSum() != prevSum) {
				// 그동안 누적된 인원수 다음 번호로 등수를 갱신 (예: 공동 1등이 2명이었다면 count는 2가 되므로 다음 등수는 3등)
				rank = count;
			}
			
			System.out.printf("[%d등] - %d점_%s\n", rank, student.getSum(), student.getName());
			
			prevSum = student.getSum();
		}
	}
}
