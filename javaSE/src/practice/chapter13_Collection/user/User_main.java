package practice.chapter13_Collection.user;

import java.util.Scanner;

/*
	기능 구현
	1. 유저 등록
		아이디, 비밀번호, 이름, 핸드폰 번호, 주소 (유저 정보)를 입력받아 저장한다.
		해당 유저 정보를 유지 리스트(ArrayList)에 저장한다.
		단, 등록하려는 유저의 아이디가
		기존 유저 리스트에 등록된 유저의 아이디와 동일한 경우 등록하지 않는다.
	2. 유저 조회
		아이디, 비밀번호를 입력받는다.
		입력한 아이디가 유저 리스트에 등록된 유저 정보가 있다면 정보를 출력한다.
		단, 입력받은 비밀번호가 일치하지 않은 경우 정보를 출력하지 않는다.
	3. 전체 조회
		유저 리스트에 저장된 전체 유저 정보를 출력한다.
		단, 이름 기준 오름차순의 정렬조건에 따라 출력한다.
 */
public class User_main {
	public static void main(String[] args) {
		// 모든 실행은 main으로 부터 시작한다.
		
		Scanner scan = new Scanner(System.in);
		
		User_method um = new User_method();
		
		int num = 0;
		
		while(true) {
			um.printMenu();		// 메뉴를 출력해주는 메서드 호출
			num = scan.nextInt();
			
			switch (num) {
				// 유저 정보를 등록하는 메서드 호출
				case 1 -> um.createUser();
				// 유저 정보를 조회하는 메서드 호출
				case 2 -> um.selectUser();
				// 유저 전체 정보를 조회하는 메서드 호출
				case 3 -> um.selectAll();
				// 프로그램 종료
				case 0 -> System.exit(0);
			}
		}
		
	}
}
