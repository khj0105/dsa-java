package practice.chapter06_Class;

/*
	BankAccount 클래스 생성

    1. 외부에서 직접 접근할 수 없도록 private 멤버변수 선언
        - String owner   (계좌 주인)
        - int balance    (잔액)

    2. 생성자 생성
        - owner 를 파라미터로 받는다(초기화)
        - balance 는 기본값 0으로 시작

    3. deposit(int money) 메서드 생성
        - 입금 기능
        - balance 에 money 를 더한다
        - "OO님 계좌에 XXX원이 입금되었습니다." 출력

    4. withdraw(int money) 메서드 생성
        - 출금 기능
        - 잔액이 부족하면
            "잔액이 부족합니다." 출력
        - 정상 출금이면
            balance 에서 money 차감
            "XXX원이 출금되었습니다." 출력

    5. info() 메서드 생성
        - 계좌 정보를 출력
        - 출력형식

        [홍길동님의 계좌]
        현재 잔액 : 5000원
 */

/*
public class BankAccount {
	private String owner;
	private int balance;
	
	BankAccount(String owner, int balance) {
		String owner =
		int balance = 0;
	}
	
	deposit(int money) {
	
	}
	
	withdraw(int money) {
		if(balance =< 0) {
			System.out.println("잔액이 부족합니다.");
		} if else (money1 = balance - money) {
			System.out.println(money1 + "원이 출금되었습니다.");
		}
	}
	
	public static void main(String[] args) {
	
	}
}
*/
public class BankAccount {
	private String owner;
	private int balance;
	
	public BankAccount(String owner) {
		this.owner = owner;
		this.balance = 0;
	}
	
	// 입금
	public void deposit(int money) {
		balance += money;
		System.out.println(owner + "님 계좌에 " + money + "원이 입금되었습니다.");
	}
	
	// 출금
	public void withdraw(int money) {
		if (balance < money) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		balance -= money;
		System.out.println(money + "원이 출금되었습니다.");
	}
	
	// 계좌 정보 출력
	public void info() {
		System.out.println("[" + owner + "님의 계좌]");
		System.out.println("현재 잔액: " + balance + "원");
	}
}
