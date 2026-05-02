package practice.chapter01_Data;

import java.util.Scanner;

public class Data_Example01 {
	public static void main(String[] args) {
		/*
				출력 형식을 텍스트 블록 사용(formatted())으로 해보기 (검색 OK!)
				지시자:  %s = 문자열, %d = 정수, %f = 실수, %c = 문자
				
				예시 출력
				이름 : 홍길동
				나이 : 20
				키 : 175.5
				성별 : 남
		 */
		
		Scanner scan = new Scanner(System.in);
				String name = "홍길동";
				int age = 20;
				double height = 175.5;
				char gender = '남';
		
		String info = """
				이름 : %s
				나이 : %d
				키 : %.1f
				성별 : %c
				""".formatted(name, age, height, gender);
		
		System.out.println(info);
	}
}
