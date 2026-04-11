package practice.chapter00_Basic;

import java.util.Scanner;

public class Basic_Example02 {
	
	public static void main(String[] args) {
/*
		이름, 나이, 키를 입력받아 출력하세요.
		입력
			이름: 홍길동
			나이: 20
			키: 188.9
		출력결과
			이름은 홍길동이고 나이는 20세, 키는 188.9cm입니다.
 */
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("이름, 나이, 키를 입력받아 출력하세요.");*/
		
		
		/*String name = scan.nextLine();
		System.out.println("이름: " + name);
		int age = scan.nextInt();
		System.out.println("나이: " + age);
		double height = scan.nextDouble();
		System.out.println("키: " + height);*/
		
		/*String name = scan.nextLine();
		int age = scan.nextInt();
		double height = scan.nextDouble();
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);*/
		
		/*System.out.print("이름: ");
		String name = scan.nextLine();
		//scan.nextLine();
		System.out.print("나이: ");
		int age = scan.nextInt();
		System.out.print("키: ");
		double height = scan.nextDouble();*/
		
		
//		System.out.println("이름은 " + name + "이고 " + "나이는 " + age + "세 " + "키는 " + height + "cm입니다.");
		
		// 입력받을 준비
		Scanner scan = new Scanner(System.in);
		
		// 변수 선언
		String name;	// 이름
		int age;		// 나이
		double height;	// 키
		
		System.out.print("이름: ");
		name = scan.nextLine();
		System.out.print("나이: ");
		age = scan.nextInt();
		System.out.print("키: ");
		height = scan.nextDouble();
		
		// 결과 출력
		System.out.println("=== 출력 결과 ===");
		System.out.println("이름은 " + name + "하고 나이는 " + age + "세, 키는" + height + "cm입니다.");
		
		
	}
}
