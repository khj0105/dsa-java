package practice.chapter04_Loop;

public class Loop_Example07 {
	public static void main(String[] args) {
/*
			3번			4번
			     *		*****
			    **		 ****
			   ***		  ***
			  ****		   **
			 *****			*
 */
		// 3번
		/*for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n==========================");
		
		// 4번
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		// 3-1
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 3-2
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < 5; j++) {
				if (j < i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
		// 3-3
		for (int i = 1; i <= 5; i++) {
			System.out.print(" ".repeat(5 - i));
			System.out.println("*".repeat(i));
		}
		
		// 3-4
		/*
				printf 출력서식
					%b : boolean 형식으로 출력
					%d : 정수 형식으로 출력
					%f : 실수 형식으로 출력
					%c : 문자 형식으로 출력
					%s : 문자열 형식으로 출력
		 */
		for (int i = 1; i <= 5; i++) {
			System.out.printf("%5s\n", "*".repeat(i)); // "*".repeat(i) 문자열 -> %s로  문자열 넣음 %5s는 5자로 맞추라는 거. 우측정렬
			System.out.printf("%-5s\n", "*".repeat(i)); // 좌측정렬
		}
		
		System.out.println("\n==========================");
		
		// 4-1
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 4-2
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
		// 4-3
		for (int i = 5; i >= 1; i--) {
			System.out.print(" ".repeat(5-i));
			System.out.println("*".repeat(i));
		}
		
		// 4-4
		for (int i = 5; i >= 1; i--) {
			System.out.printf("%5s\n", "*".repeat(i));
		}
	}
}
