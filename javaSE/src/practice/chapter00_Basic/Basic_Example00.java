package practice.chapter00_Basic;

import java.util.Scanner;

public class Basic_Example00 {
	
	public static void main(String[] args) {
		
		// 입력을 받기 위해서 생성하는 입력 객체
		Scanner sc = new Scanner(System.in); // 객체는 heap영역에 저장됨
		
		// next() vs nextLine()
		System.out.print("단어 입력(next): ");	//출력만
//		System.out.println("단어 입력(next): ");	//출력 후 개행
		String word = sc.next();
		
		// 개행문자(\n) 가 남겨져서 nextLine()이 종료되버리니깐
		sc.nextLine();
		
		System.out.println("문장 입력(nextLine): ");
		String sentence = sc.nextLine();
		
		System.out.println("word: " + word);
		System.out.println("sentence: " + sentence);
		
		// nextInt()
		System.out.println("==========");
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("주소 입력: ");
		String address = sc.nextLine();
		
		System.out.println("나이: " + age);
		System.out.println("주소: " + address);
	}
}
