package chapter.chapter06_Class;

/*
		[ 캡슐화(encapsulation) ]
		멤버변수는 private으로 외부 접근을 막고
		getter / setter 메서드를 통해서만 접근하도록 한다.
 */
class Member {
	private String id;
	private String password;
	private String phoneNumber;
	
	public Member(String id, String password, String phoneNumber) {
		this.id = id;;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}
	
	// id는 변경 불가 (읽기 전용)
	public String getId() {
		return id;
	}
	
	// 비밀번호는 조회불가, 변경만 가능
	public void setPassword(String password) {
		this.password = password;
	}
	
	// 전화번호 조회 & 변경
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	// 회원 정보 출력
	public void showInfo() {
		System.out.println("[회원 정보]");
		System.out.println("아이디: " + id);
		System.out.println("전화번호: " + phoneNumber);
	}
}
public class C053_Encapsulation {
	public static void main(String[] args) {
		Member member1 = new Member("감자", "1234", "010-1111-2222");
		
		// getter 사용
		System.out.println("아이디: " + member1.getId());
		System.out.println("전화번호: " + member1.getPhoneNumber());
		
		// setter 사용
		System.out.println("=== 전화번호 변경 ===");
		member1.setPhoneNumber("010-2222-3333");
		member1.showInfo();
	}
}
