package chapter.chapter07_Array;

public class C061_Array2D2 {
	public static void main(String[] args) {
		// 2차원 배열 성적처리
		int[][] score = {
				{77, 56, 70, 82},
				{99, 96, 89, 88},
				{81, 69, 62, 80}
		};
		
		System.out.println("=== 반별 성적 ===");
		
		int classSum = 0;		// 학급 전체 총점
		for (int i = 0; i < score.length; i++) {
			int sum = 0;		// 학급 총점
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
			double avg = (double) sum / score[i].length;
			System.out.printf("%d반 => 총점: %d, 평균: %2f\n", i + 1, sum, avg);
			classSum += sum;
		}
		System.out.println();
		
		// 전체 평균
		double totalAvg = (double) classSum / (score.length * score[0].length);
		System.out.printf("전체 학급 평균: %.2f\n", totalAvg);
	}
}
