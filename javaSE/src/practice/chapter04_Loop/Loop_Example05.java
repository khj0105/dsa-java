package practice.chapter04_Loop;

public class Loop_Example05 {
	public static void main(String[] args) {
/*
		1번			2번
		1 0 0 0 0	1 2 3 4 5
		0 2 0 0 0	2 3 4 5 6
		0 0 3 0 0 	3 4 5 6 7
		0 0 0 4 0	4 5 6 7 8
		0 0 0 0 5	5 6 7 8 9
 */
		
/*		System.out.println("\n================");
		// 1번
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
//				j =  i;
			}
			System.out.println();
		}*/
		
		System.out.println("\n================");
		// 1번 i, j가 같을 때를 확인하면 됨
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if (i==j)
					System.out.print(j + " ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
		
		/*System.out.println("\n================");
		// 2번
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
			
			}
			System.out.println();
		}*/
		
		System.out.println("\n================");
		// 2번
		for(int i = 1; i <= 5; i++) {
			for(int j = i; j < i + 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
