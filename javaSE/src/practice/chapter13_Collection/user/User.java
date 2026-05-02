package practice.chapter13_Collection.user;

public class User {
	
	// 멤버 변수
	private String id;
	private String pw;
	private String name;
	private String phone;
	private String address;
	
	// 명시적 생성자
	
	public User(String id, String pw, String name, String phone, String address) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	/*
	// 2. 정렬 기준 정의 (이름 기준 오름차순)
    @Override
    public int compareTo(User o) {
        // String 클래스의 compareTo를 사용하여 이름 순서 비교
        // 'this'는 나 자신, 'o'는 비교 대상입니다.
        int result = this.name.compareTo(o.getName());
        
        // 만약 이름이 같다면 아이디 순으로 정렬 (2차 정렬)
        if (result == 0) {
            return this.id.compareTo(o.getId());
        }
        
        return result;
    }
    
    // 3. Set 사용을 위한 중복 체크 정의 (아이디 기준)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // 주소가 같으면 동일 객체
        if (o instanceof User other) {
            return this.id.equals(other.id); // 아이디가 같으면 동일 유저
        }
        return false;
    }

    @Override
    public int hashCode() {
        // 아이디를 기준으로 해시값 생성
        return Objects.hash(id);
    }
	*/
	
	
	// toString()
	
	@Override
	public String toString() {
		return String.format("> 이름: %s(%s), 핸드폰: %s, 주소: %s", this.name, this.id, this.phone, this.address);
		/*"User{" +
				"id='" + id + '\'' +
				", pw='" + pw + '\'' +
				", name='" + name + '\'' +
				", phone='" + phone + '\'' +
				", address='" + address + '\'' +
				'}';*/
	}
	
	// Accessor : Getter & Setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPw() {
		return pw;
	}
}
