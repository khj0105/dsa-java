package chapter16;

/*
	잘못된 입력에 대해 발생시키는 사용자 정의 예외
 */
public class InvalidInputException extends RuntimeException {

	// 💡 Code Here 💡
	// 메시지를 받는 생성자 작성
	public InvalidInputException(String message) {
		super(message);
	}

}
