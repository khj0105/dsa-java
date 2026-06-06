package chapter16;

/*
	의사 정보를 정의하는 클래스 (Person 상속)
 */
public class Doctor extends Person {

	// 💡 Code Here 💡
	// 요구사항에 맞춰 멤버변수 작성 (의사번호, 진료과, 경력년수)
	private static int serialNum = 10001;
	private int doctorId;
	private String department;
	private int careerYears;
	
	// 💡 Code Here 💡
	// 요구사항에 맞춰 명시적 생성자 작성
	public Doctor(String name, String phone, String department, int careerYears) {
		super(name, phone);
		this.department = department;
		this.careerYears = careerYears;
		doctorId = serialNum++;
	}
	
	// 💡 Code Here 💡
	// 요구사항에 맞춰 getter 작성
	
	public int getDoctorId() {
		return doctorId;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public int getCareerYears() {
		return careerYears;
	}
	
	// 💡 Code Here 💡
	// 추상 메서드 오버라이드 (getId, getRole)
	
	@Override
	public int getId() {
		return doctorId;
	}
	
	@Override
	public String getRole() {
		return "의사";
	}
	
	// 💡 Code Here 💡
	// 요구사항에 맞춰 equals & hashCode 오버라이드
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Doctor doctor)) return false;
		return doctorId == doctor.doctorId;
	}
	
	@Override
	public int hashCode() {
		return doctorId;
	}
	

	// 💡 Code Here 💡
	// 요구사항에 맞춰 toString 오버라이드
	public String toString() {
		return String.format("[%s]" + "[%s]" + "번호: %d" + " / " +"이름: %s" + " / " + "진료과: %s" + " / " + "경력: %2d" + " / " + "전화: %s",
				Person.HOSPITAL, getRole(), getId(), getName(), department, careerYears, getPhone());
	}
}
