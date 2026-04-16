package chapter.chapter07_Array;

public class C065_Foreach2 {
	public static void main(String[] args) {
		int[][] score = {
				{ 77, 56, 70, 82 },
				{ 99, 23, 83, 13 },
				{ 12, 64, 86, 90 }
		};
		
		for (int[] student : score) {
			for (int subject : student) {
				System.out.print(subject + " ");
			}
			System.out.println();
		}
	}
}
