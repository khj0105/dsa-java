package chapter.chapter04_Loop;

public class C029_For2 {
	public static void main(String[] args) {
		// 1-100 까지의 숫자들의 합이 100을 넘는 순간의 숫자 구하기
		int sum = 0;
		int i;
		
		/*for (int i =0; i <= 100; i++) {
			sum = sum + i;
			if(sum > 100){
				System.out.println(i);
			}
		}*/
		for (i = 1; i < 100; i++) {
			sum = sum + i;
			if (sum > 100)
				break;
			}
		
			System.out.println("합계가 100이 넘는 시점의 숫자는 " + i);
			System.out.println("합계: " + sum);
		
	}
}
