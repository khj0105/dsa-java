package chapter16;

import java.util.HashMap;
import java.util.Scanner;

/*
	각 기능을 구현한 메서드를 정의한 클래스
 */
public class HospitalService {
	// 진료과 목록 (상수)
	public static final String[] DEPARTMENTS = {
		"내과", "외과", "소아과", "정형외과", "피부과"
	};

	// 멤버 변수
	private HashMap<Integer, Patient> patientMap;			// 환자번호 -> Patient
	private HashMap<Integer, Doctor> doctorMap;				// 의사번호 -> Doctor
	private HashMap<Integer, Reservation> reservationMap;	// 예약번호 -> Reservation
	private Scanner scan;									// Main에서 주입받은 공용 Scanner

	// 생성자 - Scanner를 외부에서 주입받아 공유한다.
	public HospitalService(Scanner scan) {
		patientMap = new HashMap<>();
		doctorMap = new HashMap<>();
		reservationMap = new HashMap<>();
		this.scan = scan;
	}

	// -------------------------------------------------------------
	// 메인메뉴
	public void mainMenu() {
		System.out.println("""

				[ SeoulMedical 진료예약 시스템 ]
				1. 환자 등록
				2. 의사 등록
				3. 진료 예약
				4. 예약 취소
				5. 진료 완료 처리
				6. 전체 예약 조회
				0. 프로그램 종료
				""");
		System.out.print("선택 > ");
	}

	// -------------------------------------------------------------
	// 1) 환자 등록
	// 💡 Code Here 💡
	// 1. 이름, 전화, 출생연도, 혈액형을 입력 받기
	// 2. 출생연도(1900~2026), 혈액형(A/B/O/AB) 유효성 검증
	//    - 잘못된 입력은 사용자 정의 예외(InvalidInputException)를 발생시키고 재입력 받기
	// 3. Patient 인스턴스를 생성하여 patientMap에 저장
	public void insertPatient() {
		HashMap<Integer, Patient> patientMap = new HashMap<>();
		
		System.out.println("\n[ 환자등록 ]");
		
		System.out.print("이름 입력 > ");
		String name = scan.nextLine();
		System.out.print("전화 입력 > ");
		String phone = scan.nextLine();
		
		int birthYear = 0;
		String bloodType = "";
		while(true) {
			System.out.print("출생연도: ");
			birthYear = scan.nextInt();
//			if (birthYear < 1900 || birthYear > 2026) {
//				throw new InvalidInputException("출생연도는 1900~2026 사이로 입력하세요.");
//			}
			System.out.print("혈액형: ");
			bloodType = scan.nextLine();
//			if (!bloodType.equals("A")  && !bloodType.equals("B")  && !bloodType.equals("AB")  && !bloodType.equals("O")) {
//				throw new InvalidInputException("혈액형은 A, B, O, AB 중 하나로 입력하세요.");
//			}
			break;
		}
	}

	// -------------------------------------------------------------
	// 2) 의사 등록
	public void insertDoctor() {
		System.out.println("\n[ 의사등록 ]");

		// 💡 Code Here 💡
		// 1. 이름, 전화, 진료과(1~5번 선택), 경력년수(0~60)를 입력 받기
		// 2. 잘못된 입력은 사용자 정의 예외를 발생시키고 재입력 받기
		// 3. Doctor 인스턴스를 생성하여 doctorMap에 저장
		System.out.print("이름 입력 > ");
		String name = scan.nextLine();
		System.out.print("전화 입력 > ");
		String phone = scan.nextLine();
		System.out.print("""
				진료과 선택:
					1. 내과
					2. 외과
					3. 소아과
					4. 정형외과
					5. 피부과
				""");
		System.out.print("*진료과 : " );
		int department = scan.nextInt();
		System.out.print("*경력년수 : ");
		int careerYears = scan.nextInt();
		System.out.print("등록되었습니다. (의사번호: " );
		
	}

	// -------------------------------------------------------------
	// 3) 진료 예약
	public void makeReservation() {
		System.out.println("\n[ 진료예약 ]");

		// 💡 Code Here 💡
		// 1. 환자번호 입력 → patientMap에서 조회 (없으면 메시지 출력 후 종료)
		// 2. 의사번호 입력 → doctorMap에서 조회 (없으면 메시지 출력 후 종료)
		// 3. 예약 날짜(yyyy-MM-dd 형식), 시간(9~17) 입력 받고 유효성 검증
		// 4. 시간 충돌 검증:
		//    - 같은 의사가 같은 날짜+시간에 "예약완료" 상태의 다른 예약을 가질 수 없음
		//    - 같은 환자가 같은 날짜+시간에 "예약완료" 상태의 다른 예약을 가질 수 없음
		// 5. Reservation 인스턴스 생성하여 reservationMap에 저장
		System.out.print("환자번호 입력 > ");
		int serialNum = scan.nextInt();
		System.out.print("의사번호 입력 > ");
		int serialNum1 = scan.nextInt();
		System.out.print("*날짜(yyyy-MM-dd): ");
		String date = scan.nextLine();
		System.out.print("시간(9-17) : ");
		int time = scan.nextInt();
		System.out.print("예약되었습니다. (예약번호: )");
	}

	// -------------------------------------------------------------
	// 4) 예약 취소
	public void cancelReservation() {
		System.out.println("\n[ 예약취소 ]");

		// 💡 Code Here 💡
		// 1. 예약번호를 입력 받기
		// 2. reservationMap에서 해당 예약을 찾고, "예약완료" 상태일 경우에만 "취소" 로 변경
		System.out.print("예약번호 입력 > ");
		System.out.print("취소되었습니다.");
	}

	// -------------------------------------------------------------
	// 5) 진료 완료 처리
	public void completeReservation() {
		System.out.println("\n[ 진료완료처리 ]");

		// 💡 Code Here 💡
		// 1. 예약번호를 입력 받기
		// 2. reservationMap에서 해당 예약을 찾고, "예약완료" 상태일 경우에만 "진료완료" 로 변경
		System.out.print("예약번호 입력 > ");
		System.out.print("진료완료 처리되었습니다.");
	}

	// -------------------------------------------------------------
	// 6) 전체 예약 조회
	public void selectAllReservations() {
		System.out.println("\n[ 전체예약조회 ]");

		// 💡 Code Here 💡
		// 1. reservationMap에 등록된 모든 예약을 다음 정렬조건으로 출력
		//    (1순위: 날짜 오름차순, 2순위: 시간 오름차순, 3순위: 예약번호 오름차순)

	}
}
