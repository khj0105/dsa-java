package practice.chapter04_Loop;

public class Loop_Example06 {
	public static void main(String[] args) {
/*
		1번			2번
		*			*****
		**			****
		***			***
		****		**
		*****		*
 */
		
		// 1번
		/*for(int i = 1; i <= 5; i++) {
			for(int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		// 2번
		/*for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if (i == j)
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		// 1-1번
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 1-2번
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if (j <= i)
					System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n==========================");
		
		
		// 2-1번
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 2-2번
		for (int i = 5; i > 0; i--) {
			for (int j = 5; j > 0; j--) {
				if (j <= i)
					System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
