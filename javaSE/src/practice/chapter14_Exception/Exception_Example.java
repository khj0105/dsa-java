package practice.chapter14_Exception;


import java.util.Scanner;

/*
	[ 실습 ]
	주민등록번호를 입력받아 형식을 검사하는 프로그램을 작성하시오. (예외 처리)
	
	조건
	1. 길이가 14자리가 아니면 LengthException 발생
	2. 7번째 문자가 '-'가 아니면 DashException 발생
	3. 예외 메시지를 출력하고 다시 입력받기
	4. 정상 입력 시 프로그램 종료
 */
/*class LengthException extends Exception {
	public LengthException(String message) {
		super(message);
	}
}
class DashException extends Exception {
	public DashException(String message) {
		super(message);
	}

}

public class Exception_Example {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("주민등록번호를 입력하세요. : ");
		int number = scan.nextInt();
		String number1 =
		
		try{
		
		} catch (Exception e) {
		
		}
		scan.close();
	}
	
	public static void checkLength (int number) throws LengthException {
		if (number.length() != 14 ) {
			throw new LengthException("길이는 14자리여야 합니다.");
		}
	}
	
	public static void checkDash (String dash) throws DashException {
		if (dash) {
			throw new DashException("7번째 자리에는 -가 있어야 합니다.");
		}
	}*/

// 길이 예외
class LengthException extends Exception {
	public LengthException(String message) {
		super(message);
	}
}

class DashException extends Exception {
	public DashException(String message) {
		super(message);
	}
}

public class Exception_Example {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.println("주민등록번호를 입력하세요: ");
				String ssn = scan.nextLine();
				
				checkSSN(ssn);
				
				System.out.println("정상 입력 완료");
				break;
			} catch (LengthException e) {
				System.out.println(e.getMessage());
			} catch (DashException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("알 수 없는 오류가 발생했습니다.");
			}
		}
	}
	
	// 주민등록번호 형식 검사 메서드
	public static void checkSSN(String ssn) throws LengthException, DashException {
		if (ssn.length() != 14) {
			throw new LengthException("* 14자리를 입력해주세요.");
		}
		if (ssn.charAt(6) != '-') {
			throw new DashException("* -을 입력해주세요.");
		}
	}
}