package practice.chapter11_Object;

import java.util.Scanner;

public class Object_Example01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
/*
		주민등록번호 입력받기
		1. - 을 포함한 14자리 문자열을 입력받는다.
		2. 14자리가 아니거나, 7번째 문자가 - 가 아니면 종료한다.
		3. 앞 6자리는 생년월일, 뒤 첫 번째 숫자는 성별/세기를 판별한다.
		4. 뒷자리 첫 숫자가
		   1, 2 -> 1900년대
		   3, 4 -> 2000년대
		   1, 3 -> 남성
		   2, 4 -> 여성
		   
		출력결과
			주민등록번호를 입력하세요 (예: 980101-1234567): 980101-1234567
			출생 연도 : 1998
			출생 월 : 01
			출생 일 : 01
			성별 : 남성
 */
		
		System.out.print("주민등록번호를 입력하세요 (예: 980101-1234567): ");
		String ssn = scan.nextLine();
		
		// 1. 길이 검사
		if (ssn.length() != 14) {
			System.out.println("잘못된 입력입니다. 주민등록번호는 - 포함 14자리여야 합니다.");
			return;
		}
		
		// 2. 하이픈 위치 검사
		if (ssn.charAt(6) != '-') {
			System.out.println("잘못된 입력입니다. 7번째 자리에 - 가 있어야 합니다.");
			return;
		}
		
		// 3. 숫자 검사 (- 제외)
		for (int i = 0; i < ssn.length(); i++) {
			if (i == 6) continue; // '-' 위치는 검사 제외
			
			// 이 문자가 숫자인지 검사하는 메서드
			if (!Character.isDigit(ssn.charAt(i))) {
				System.out.println("잘못된 입력입니다. - 를 제외한 나머지는 숫자여야 합니다.");
				return;
			}
		}
		
		// 4. 생년월일 추출
		String year  = ssn.substring(0, 2);
		String month = ssn.substring(2, 4);
		String day   = ssn.substring(4, 6);
		
		// 5. 성별 코드 추출
		char genderCode = ssn.charAt(7);
		
		String fullYear = "";
		String gender = "";
		
		// 6. 출생 연도와 성별 판별
		switch (genderCode) {
			case '1':
				fullYear = "19" + year;
				gender = "남성";
				break;
			case '2':
				fullYear = "19" + year;
				gender = "여성";
				break;
			case '3':
				fullYear = "20" + year;
				gender = "남성";
				break;
			case '4':
				fullYear = "20" + year;
				gender = "여성";
				break;
			default:
				System.out.println("잘못된 주민등록번호입니다. 성별 코드를 확인하세요.");
				return;
		}
		
		// 7. 월/일 범위 간단 검사
		int monthNum = Integer.parseInt(month);
		int dayNum   = Integer.parseInt(day);
		
		if (monthNum < 1 || monthNum > 12) {
			System.out.println("잘못된 주민등록번호입니다. 월 범위를 확인하세요.");
			return;
		}
		
		if (dayNum < 1 || dayNum > 31) {
			System.out.println("잘못된 주민등록번호입니다. 일 범위를 확인하세요.");
			return;
		}
		
		// 8. 출력
		System.out.println("출생 연도 : " + fullYear);
		System.out.println("출생 월 : " + month);
		System.out.println("출생 일 : " + day);
		System.out.println("성별 : " + gender);
		
		scan.close();
	}
}