package practice.chapter05_Method;

import java.util.Scanner;

/*
	기능 상세
	1. 입금
		입금 금액을 입력받는다.
		기존 잔액에 금액을 더한다.
		"입금 완료"를 출력한다.
		
	2. 출금
		출금 금액을 입력받는다.
		현재 잔액보다 출금 금액이 크면
		→ "잔액이 부족합니다." 출력
		그렇지 않으면
		→ 잔액에서 금액을 차감하고 "출금 완료" 출력
		
	3. 잔액조회
		현재 잔액을 출력한다.
		
	4. 종료
		"프로그램 종료"를 출력하고 프로그램을 종료한다.
		
	* 추가 조건 *
		초기 잔액은 0원으로 설정한다.
		메뉴 선택은 무한 반복으로 처리한다.
		각 기능(입금, 출금, 잔액조회)은 별도의 메서드로 구현한다.
		입금/출금 후 변경된 잔액은 반드시 반환하여 반영한다.
		
	- Ex.
		실행 예1				실행 예2				실행 예3				실행 예4
		===== ATM =====		===== ATM =====		===== ATM =====		===== ATM =====
		1. 입금				1. 입금				1. 입금				1. 입금
		2. 출금				2. 출금				2. 출금				2. 출금
		3. 잔액조회			3. 잔액조회			3. 잔액조회			3. 잔액조회
		4. 종료				4. 종료				4. 종료				4. 종료
		선택 : 1				선택 : 3				선택 : 2				선택 : 4
		입금 금액 : 5000		현재 잔액 : 5000		출금 금액 : 2000		프로그램 종료
		입금 완료								출금 완료
 */
public class Method_Example {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int balance = 0;
		
		ATM:
		while (true) {
			
			System.out.println("""
					===== ATM =====
					1. 입금
					2. 출금
					3. 잔액조회
					4. 종료
					""");
			
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			
			switch (menu) {
				case 1 -> balance = deposit(balance);
				case 2 -> balance = withdraw(balance);
				case 3 -> checkBalance(balance);
				case 4 -> {
					System.out.println("프로그램 종료");
					break ATM;   // 프로그램 종료
				}
				default -> System.out.println("잘못된 메뉴입니다.");
			}
		}
		
		sc.close();
	}
	
	// 입금 메서드
	static int deposit(int balance) {
		
		System.out.print("입금 금액 : ");
		int money = sc.nextInt();
		
		balance += money;
		System.out.println("입금 완료");
		
		return balance;
	}
	
	// 출금 메서드
	static int withdraw(int balance) {
		
		System.out.print("출금 금액 : ");
		int money = sc.nextInt();
		
		if (money > balance) {
			System.out.println("잔액이 부족합니다.");
		}
		else {
			balance -= money;
			System.out.println("출금 완료");
		}
		
		return balance;
	}
	
	// 잔액 조회 메서드
	static void checkBalance(int balance) {
		System.out.println("현재 잔액 : " + balance);
	}
	
}

