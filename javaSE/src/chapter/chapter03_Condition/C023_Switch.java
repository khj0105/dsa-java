package chapter.chapter03_Condition;

public class C023_Switch {
	public static void main(String[] args) {
		
		// switch - case 문
		// 하나의 변수 값을 기준으로 여러 경우를 비교할 때 사용
		
		int ranking = 2;
		
		switch (ranking) {
			case 1:
				System.out.println("축하합니다. 금메달입니다.");
				break;		// switch문 종료
			case 2:
				System.out.println("은메달을 수여합니다.");
				break;
			case 3:
				System.out.println("동메달을 수여합니다.");
				break;
			default:
				System.out.println("참가상을 드립니다.");
				break;
		}
	}
}
