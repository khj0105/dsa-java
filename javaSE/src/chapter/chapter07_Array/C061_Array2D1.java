package chapter.chapter07_Array;

/*
 	[ 2차원 배열 ]
 	배열 안에 배열이 있는 구조
 	int[][] score
 */
public class C061_Array2D1 {
	public static void main(String[] args) {
		int[][] score = {
			//	  0   1   2   3
				{77, 56, 70, 82},		// 0
				{99, 96, 89, 88},		// 1
				{81, 69, 62, 80}		// 2
		};
		
		System.out.println("=== 학생 성적 ===");
		
		for (int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "번 학생의 성적: ");
			
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
	}
}
