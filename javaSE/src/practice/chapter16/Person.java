package chapter16;

/*
	병원 구성원의 공통 속성을 정의하는 추상 클래스 (완성본 제공)
	Patient(환자), Doctor(의사) 클래스가 본 클래스를 상속받는다.
	※ 본 클래스는 수정하지 않고 그대로 사용한다.
 */
public abstract class Person {
	// 병원명 (모든 인스턴스가 공유, 변경 불가)
	public static final String HOSPITAL = "SeoulMedical";

	private String name;	// 이름
	private String phone;	// 전화번호

	// 명시적 생성자
	public Person(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	// getter & setter
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getPhone() { return phone; }
	public void setPhone(String phone) { this.phone = phone; }

	// 자식 클래스에서 자신의 고유번호를 반환하도록 강제
	public abstract int getId();

	// 자식 클래스에서 역할("환자" / "의사")을 반환하도록 강제
	public abstract String getRole();
}
