package chapter.chapter07_Array;

/*
	[ 불규칙 배열 ]
	2차원 배열에서 2번째 배열의 길이가 서로 다른 배열
 */
public class C062_Array2D3 {
	public static void main(String[] args) {
		int[][] score = {
				{77,56,70,82,95,96,98,82},
				{99,96},
				{81,69,62,88,77}
		};
		System.out.println("=== 불규칙 배열 출력 ===");
		for (int i = 0 ; i < score.length; i++){
			System.out.print((i + 1) + "번 학생의 성적: ");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
	}
}
