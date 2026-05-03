package practice.chapter07_Array;

import java.util.Scanner;

public class Array_Example {
	
	public static void main(String[] args) {
	
/*
		문제
		학생 5명의 시험 점수를 입력받아 배열에 저장하고
		다음 정보를 출력하는 프로그램을 작성하시오.
		
		1. 모든 점수 출력
		2. 총점
		3. 평균
		4. 최고 점수
		5. 최저 점수
		
		출력 결과
			학생1 점수 입력 : 30
			학생2 점수 입력 : 50
			학생3 점수 입력 : 40
			학생4 점수 입력 : 20
			학생5 점수 입력 : 100
			
			입력한 점수
			30 50 40 20 100
			
			총점 : 240
			평균 : 48.0
			최고 점수 : 100
			최저 점수 : 20
*/
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		
		for (int i = 0; i < score.length; i++) {
			System.out.print("학생" + (i + 1) + " 점수 입력 : ");
			score[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("입력한 점수");
		
		for (int s : score) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		int sum = 0;
		int max = score[0];
		int min = score[0];
		
		for (int s : score) {
			
			sum += s;
			
			if (s > max) {
				max = s;
			}
			
			if (s < min) {
				min = s;
			}
		}
		
		double avg = (double) sum / score.length;
		
		System.out.println();
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
	}
}