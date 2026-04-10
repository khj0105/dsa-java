package chapter.chapter04_Loop;

public class C036_Break {
	public static void main(String[] args) {
/*
		[ break ]
		- 가장 가까운 반복문 하나를 즉시 종료한다.
		- switch문에서도 사용
		- 중첩 반복문에서 사용하면, 자신을 감싸고 있는 안쪽 반복문만 종료
 */
		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				break;
			}
			System.out.println("반복회차: " + i);
		}
		
		System.out.println("\n=== 중첩 반복문에서 break ===");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 3 && j == 3) {
					break;
				}
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("\n=== label break ===");
		// label 을 사용하면 원하는 바깥 반복문까지 종료할 수 있음
		loop:
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 3 && j == 3) {
					break loop;		// loop 이름이 붙은 반복문을 종료
				}
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
