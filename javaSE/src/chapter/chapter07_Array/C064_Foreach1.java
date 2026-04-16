package chapter.chapter07_Array;

public class C064_Foreach1 {
	public static void main(String[] args) {
/*
		[ enhanced for문 (foreach) ]
		- 배열이나 컬렉션(list, set 등)을 간단하게
			순회할 때 사용하는 반복문
		
		기본 구조
			for (데이터타입 변수명 : 배열 or 컬렉션) {
				반복문 코드
			}
 */
		int[] score = { 88, 94, 72, 75, 23 };
		int sum = 0;
		
		// 배열 순회
		for (int s : score) {
			sum += s;
		}
		System.out.println("총점: " + sum);
		System.out.println("평균: " + (double) sum / score.length);
		
		// foreach 특징
		int[] score2 = {88, 94, 72, 75, 23};
		for (int s : score2) { // s가 score2를 복사하는 것이기 때문에 원본 score2는 변하지 않는다. 객체의 경우 주속값을 복사하는 것이기 때문에 인스턴스가 같을 수 있다.
			s++;
			System.out.print(s + " ");
		}
		System.out.println();
		
		// 원본 확인
		System.out.println("score2[0] = " + score2[0]);
	}
}
