package chapter16;

/*
	환자 정보를 정의하는 클래스 (Person 상속)
 */
public class Patient extends Person {

	// 💡 Code Here 💡
	// 요구사항에 맞춰 멤버변수 작성 (환자번호, 출생연도, 혈액형)
	private static int serialNum = 20260001;
	private int patientId;
	private int birthYear;
	private String bloodType;

	// 💡 Code Here 💡
	// 요구사항에 맞춰 명시적 생성자 작성
	public Patient(String name, String phone, int birthYear, String bloodType) {
		super(name, phone);
		this.birthYear = birthYear;
		this.bloodType = bloodType;
		patientId = serialNum++;
	}

	// 💡 Code Here 💡
	// 요구사항에 맞춰 getter 작성
	
	public int getPatientId() {
		return patientId;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public String getBloodType() {
		return bloodType;
	}
	
	// 💡 Code Here 💡
	// 추상 메서드 오버라이드 (getId, getRole)
	
	@Override
	public int getId() {
		return patientId;
	}
	
	@Override
	public String getRole() {
		return "환자";
	}
	
	
	// 💡 Code Here 💡
	// 요구사항에 맞춰 equals & hashCode 오버라이드
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Patient patient)) return false;
		return patientId == patient.patientId;
	}
	
	@Override
	public int hashCode() {
		return patientId;
	}

	// 💡 Code Here 💡
	// 요구사항에 맞춰 toString 오버라이드
	public String toString() {
		return String.format("[%s]" +" "+ "[%s]" + "번호: %d" + " / " + "이름: %s" + " / "+ "전화: %s" + " / " + "출생: %d" + " / " + "혈액형: %s",
				Person.HOSPITAL, getRole(), getId(), getName(), getPhone(), birthYear, bloodType);
	}
}
