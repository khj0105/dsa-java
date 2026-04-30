package chapter.chapter14_Exception;

/*
	[ 사용자 정의 예외 ]
	자바에는 많은 예외 클래스가 존재하지만,
	프로그램의 상황에 맞는 예외를 직접 만들 수 있다.
 */

import java.util.Scanner;

class ScoreException extends Exception {
	
	public ScoreException(String message) {
		super(message);
	}
}
public class C126_CustomException {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int score = scan.nextInt();
		
		try{
			checkScore(score);
			System.out.println("입력한 점수: " + score);
		} catch (ScoreException e){
			System.out.println("사용자 정의 예외 발생");
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료");
	}
	
	// 점수 검사 메서드
	public static void checkScore(int score) throws ScoreException {
		if (score < 0 || score > 100) {
			// 사용자 정의 예외 발생
			throw new ScoreException("점수는 0~100 사이여야 합니다.");
		}
	}
}
