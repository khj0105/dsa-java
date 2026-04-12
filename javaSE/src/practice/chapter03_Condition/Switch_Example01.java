package practice.chapter03_Condition;

import java.util.Scanner;

public class Switch_Example01 {
	public static void main(String[] args) {
/*
		출생연도를 입력받아 띠를 출력하세요.
		연도를 12로 나눈 나머지에 따라 띠가 결정됩니다.
		
		0 : 원숭이	6 : 호랑이
		1 : 닭		7 : 토끼
		2 : 개		8 : 용
		3 : 돼지		9 : 뱀
		4 : 쥐		10 : 말
		5 : 소		11 :: 양
		
		실행 예
		연도를 입력하세요: 2001
		2001년생은 뱀띠입니다.
 */
		
/*
		// 내가 짠 것
		Scanner scan = new Scanner(System.in);
		System.out.print("연도를 입력하세요: ");
		int year = scan.nextInt();
		
		int Snum = year % 12;
		switch(Snum) {
			case 0:
				System.out.println("원숭이");
				break;
			case 1:
				System.out.println("닭");
				break;
			case 2:
				System.out.println("개");
				break;
			case 3:
				System.out.println("돼지");
				break;
			case 4:
				System.out.println("쥐");
				break;
			case 5:
				System.out.println("소");
				break;
			case 6:
				System.out.println("호랑이");
				break;
			case 7:
				System.out.println("토끼");
				break;
			case 8:
				System.out.println("용");
				break;
			case 9:
				System.out.println("뱀");
				break;
			case 10:
				System.out.println("말");
				break;
			case 11:
				System.out.println("양");
				break;
		}
		System.out.println(year + "년생은 " + Snum + "띠입니다.");*/
		
/*
		// 제미나이
		System.out.print("연도를 입력하세요: ");
		int year = scan.nextInt();
		
		int Snum = year % 12;
		String ddValue = "";
		
		switch(Snum) {
			case 0:  ddValue = "원숭이"; break;
			case 1:  ddValue = "닭";    break;
			case 2:  ddValue = "개";    break;
			case 3:  ddValue = "돼지";  break;
			case 4:  ddValue = "쥐";    break;
			case 5:  ddValue = "소";    break;
			case 6:  ddValue = "호랑이"; break;
			case 7:  ddValue = "토끼";  break;
			case 8:  ddValue = "용";    break;
			case 9:  ddValue = "뱀";    break;
			case 10: ddValue = "말";    break;
			case 11: ddValue = "양";    break;
		}
		
		System.out.println(year + "년생은 " + ddValue + "띠입니다.");
		
		or
		
		String ddValue = switch (Snum) {
		case 0 -> "원숭이";
		case 1 -> "닭";
		// ... 중략 ...
		case 9 -> "뱀";
		default -> "알 수 없음";
};
	
*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("연도를 입력하세요: ");
		int year = scan.nextInt();
		
		String result = "";
		
		switch (year % 12) {
			case 0:	result = "원숭이";break;
			case 1: result = "닭";	break;
			case 2: result = "개";	break;
			case 3: result = "돼지";	break;
			case 4: result = "쥐";	break;
			case 5: result = "소";	break;
			case 6: result = "호랑이";break;
			case 7: result = "토끼";	break;
			case 8: result = "용";	break;
			case 9: result = "뱀";	break;
			case 10: result = "말";	break;
			case 11: result = "양";	break;
		}
		System.out.println(year + "년생은 " + result + "띠입니다.");
		
		
	}
}
