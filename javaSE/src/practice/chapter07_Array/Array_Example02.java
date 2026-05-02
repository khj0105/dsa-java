package practice.chapter07_Array;

import java.util.Scanner;

public class Array_Example02 {
	public static void main(String[] args) {
/*
		학생 5명의 시험 점수를 입력받아 배열에 저장하고
		각 학생의 등수를 계산하여 출력하는 프로그램을 작성하시오.
		
		단, 자기보다 점수가 높은 학생 수 + 1 이 등수이다.
		
		출력 결과
			학생1 점수 입력 : 30
			학생2 점수 입력 : 100
			학생3 점수 입력 : 50
			학생4 점수 입력 : 75
			학생5 점수 입력 : 10
			
			학생1 점수 : 30 / 등수 : 4
			학생2 점수 : 100 / 등수 : 1
			학생3 점수 : 50 / 등수 : 3
			학생4 점수 : 75 / 등수 : 2
			학생5 점수 : 10 / 등수 : 5
*/
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		int[] rank = new int[5];
		
		for (int i = 0; i < score.length; i++) {
			System.out.print("학생" + (i + 1) + " 점수 입력 : ");
			score[i] = sc.nextInt();
		}
		
		// 기본 등수 1등으로 시작
//		for (int i = 0; i < rank.length; i++) {
//			rank[i] = 1;
//		}
		
		// 등수 계산
		// 내 점수 < 다른 점수 → 내 등수 증가
		for (int i = 0; i < score.length; i++) {
			rank[i] = 1;			// 기본 등수 1등으로 시작
			
			for (int j = 0; j < score.length; j++) {
				if (score[i] < score[j]) {
					rank[i]++;
				}
			}
		}
		System.out.println();
		
		for (int i = 0; i < score.length; i++) {
			System.out.println("학생" + (i + 1) +
					" 점수 : " + score[i] +
					" / 등수 : " + rank[i]);
		}
	}
}
