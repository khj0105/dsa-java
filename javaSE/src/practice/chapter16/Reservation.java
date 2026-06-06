package chapter16;

import javax.print.Doc;

/*
	진료 예약 정보를 정의하는 클래스
 */
public class Reservation {

	// 💡 Code Here 💡
	// 예약 상태 상수 작성 (RESERVED="예약완료", COMPLETED="진료완료", CANCELED="취소")
	public static final String RESERVED = "예약완료";
	public static final String COMPLETED = "진료완료";
	public static final String CANCELED = "취소";
	private static int serialNum = 1;
	private int reservationId;
	private Patient patient;
	private Doctor doctor;
	private String date;
	private int time;
	private String status;
	
	// 💡 Code Here 💡
	// 요구사항에 맞춰 멤버변수 작성 (예약번호, 환자, 의사, 날짜, 시간, 상태)
	public Reservation(int reservationId, Patient patient, Doctor doctor, String date, int time, String status) {
		this.reservationId = reservationId;
		this.patient = patient;
		this.doctor = doctor;
		this.date = date;
		this.time = time;
		this.status = status;
	}

	// 💡 Code Here 💡
	// 요구사항에 맞춰 명시적 생성자 작성
	public Reservation(Patient patient, Doctor doctor, String date, int time) {
		reservationId = serialNum++;
		
		status = RESERVED;
	}
	
	// 💡 Code Here 💡
	// 요구사항에 맞춰 getter / 상태 setter 작성
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public int getReservationId() {
		return reservationId;
	}
	
	public Patient getPatient() {
		return patient;
	}
	
	public Doctor getDoctor() {
		return doctor;
	}
	
	public String getDate() {
		return date;
	}
	
	public int getTime() {
		return time;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	// 💡 Code Here 💡
	// 요구사항에 맞춰 equals & hashCode 오버라이드
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Reservation reservation)) return false;
		return reservationId == reservation.reservationId;
	}
	
	@Override
	public int hashCode() {
		return reservationId;
	}

	// 💡 Code Here 💡
	// 요구사항에 맞춰 toString 오버라이드
//	public String toString() {
//		return String.format("[예약#%3d]" + "[%d]" + "%2d시" + " / " +"환자: %s" + (serialNum) + " / " + "의사: %s" + (Doctor.department) + " / " + "상태: + [%s]",
//				 date, time + Patient.getRole() + Doctor.getName()  + RESERVED);
//	}

}
