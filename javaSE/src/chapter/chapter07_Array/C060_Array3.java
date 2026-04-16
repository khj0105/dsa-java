package chapter.chapter07_Array;

public class C060_Array3 {
	public static void main(String[] args) {
		// 배열 간편 초기화 (선언 & 생성 & 초기화)
		int[] score = {88, 99, 70, 55, 100};
		
		System.out.println("=== 초기 배열 ===");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
		System.out.println("배열 길이: " + score.length);
		
		// 배열 재할당 (기존의 참조값에서 다른 참조값으로 바꾸고 기존의 참조값은 결국 가비지 컬렉터로 처리함)
		System.out.println("=== 배열 재할당 ===");
		score = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
		System.out.println("배열 길이: " + score.length);
	}
}
