package practice.chapter02_Operator;

import java.util.Scanner;

public class Oper_Example02 {
	public static void main(String[] args) {
		/*
			과목 3개를 입력받아 점수에 따른 합격여부를 출력한다.

			합격조건
			① 세 과목의 평균점수가 60점 이상
			② 한 과목이라도 40점 미만이면 과락으로 불합격

			출력예시
			국어: 80
			영어: 80
			수학: 35
			합격여부: false
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("국어: ");
		int kor = scan.nextInt();
		System.out.print("영어: ");
		int eng = scan.nextInt();
		System.out.print("수학: ");
		int math = scan.nextInt();
		
		// 합게
		int sum = kor + eng + math;
		
		// 평균
		double avg = sum / 3.0;
		
		// 평균 조건
		boolean avgCondition = (avg >= 60);
		
		// 과락 조건
		boolean cutCondition =
				(kor >= 40) && (eng >= 40) && (math >= 40);
		
		// 최종 결과
		boolean result = avgCondition && cutCondition;
		
		System.out.println("합격 여부: " + result);
	}
}
