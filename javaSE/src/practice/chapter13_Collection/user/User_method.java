package practice.chapter13_Collection.user;

import java.util.*;

public class User_method {
	
	Scanner scan = new Scanner(System.in);
	
	// 유저 등록 리스트
	List<User> userList = new ArrayList<>();
	
	// 메뉴를 출력하는 메서드
	public void printMenu() {
		System.out.println();
		System.out.println("""
				== 유저 관리 프로그램 ==
				1. 유저 정보 등록
				2. 유저 정보 조회
				3. 전체 정보 조회
				0. 종		료
				====================
				""");
		System.out.println("-> 메뉴의 번호: ");
	}
	
	// 1. 유저 정보 등록
	public void createUser() {
		System.out.println();
		System.out.println("===================");
		System.out.println("유저 정보를 등록합니다.");
		System.out.println("-> 아이디: ");
		String id = scan.nextLine();
		System.out.println("-> 비밀번호: ");
		String pw = scan.nextLine();
		System.out.println("-> 이름: ");
		String name = scan.nextLine();
		System.out.println("-> 핸드폰번호: ");
		String phone = scan.nextLine();
		System.out.println("-> 주소: ");
		String address = scan.nextLine();
		
		// 유저 정보 저장
		User user = new User(id, pw, name, phone, address);
		
		// id가 같은 유저가 있는지 확인
		for (User u : userList) {
			if (u.getId().equals(id)) {
				System.out.println("[등록 실패] 존재하는 ID입니다.");
				return;		// 메서드 종료
			}
		}
		
		// 유저 리스트에 유저 정보 저장
		userList.add(user);
		
		System.out.println("[등록 성공] 유저를 등록합니다.");
	}
	
	// 2. 유저 정보 조회
	public void selectUser() {
/*		System.out.println();
		System.out.println("===================");
		System.out.println("-> 아이디: ");
		String id = scan.nextLine();
		System.out.println("-> 비밀번호: ");
		String pw = scan.nextLine();
		
		for (User u: userList) {
			if(u.getId().equals(id)) {
//				System.out.println(u);
				if(!u.getPw().equals(pw)){
					System.out.println("[등록 실패] 일치하지 않는 PW입니다.");
					return;
				}else {
					System.out.println(u);
				}
			}
		}*/
		System.out.println();
		// 유저 리스트를 전체 탐색
		if (userList.isEmpty()) {
			System.out.println("[조회 실패] 등록된 유저가 없습니다.");
			return;
		}
		
		// 유저 1명에 대한 id가 입력받은 id와 일치여부 확인, id 입력받기
		System.out.println("유저 정보를 조회합니다.");
		System.out.print("-> 조회할 아이디: ");
		String searchId = scan.nextLine();
		
		// 유저리스트에 입력받은 id와 일치하는 유저 정보가 있는지 확인
		for (User u : userList) {
			// id가 일치할 경우
			if (u.getId().equals(searchId)) {
				System.out.print("-> 비밀번호 확인: ");
				String checkPw = scan.nextLine();
				
				// 비밀번호가 일치할 경우, 유저 정보 출력
				if (u.getPw().equals(checkPw)) {
					System.out.println("[조회 성공] 유저정보를 출력합니다.");
					System.out.println(u.toString());
				} else {    // 비밀번호가 틀릴경우,
					System.out.println("[조회 실패] 패스워드가 틀렸습니다.");
				}
				return;
			}
			// id가 일치하는 회원이 없는 경우
			System.out.println("[조회 실패] 회원이 존재하지 않습니다.");
		}
	}
	
	// 3. 유저 전체 정보 조회
	public void selectAll() {
		
		System.out.println();
		/*System.out.println(userList);
		
		 Comparable<> {}*/
		if (userList.isEmpty()) {
			System.out.println("[조회 실패] 등록된 유저가 없습니다.");
			return;
		}
		
		System.out.println("전체 정보를 조회합니다.");
		
		// 이름 기준 오름차순 ( 정렬 기준을 정해야함, 익명클래스 )
		Collections.sort(userList, new Comparator<User>() {
			@Override
			public int compare(User u1, User u2) {
				return u1.getName().compareTo(u2.getName());
			}
		});
		
		// 전체 출력
		for (User user : userList) {
			System.out.println(user);
		}
	}
}
