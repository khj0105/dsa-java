package practice.chapter06_Class;

public class Class_Example {
	public static void main(String[] args) {
		
		// 인스턴스 생성
		BankAccount acc1 = new BankAccount("홍길동");
		
		// 정보 출력
		acc1.info();
		System.out.println();
		
		// 입금
		acc1.deposit(10000);
		acc1.deposit(5000);
		System.out.println();
		
		// 출금
		acc1.withdraw(3000);
		acc1.withdraw(20000);
		
		// 정보 출력
		acc1.info();
	}
}
