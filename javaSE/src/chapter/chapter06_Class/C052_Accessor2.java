package chapter.chapter06_Class;

class Score {
	private int point;	// 멤버변수, 인스턴스 변수
	
	Score(int point) {
		setPoint(point);
	}	// 생성자 파라미터있으니 명시적 생성자, 메서드는 앞에 리턴타입이 없으니 아님, 클래스명과 같으니 생성자이다.
	
	public int getPoint() {
		return point;
	}	// 리턴타입이 있고 클래스명과 다르니 메서드
	
	public void setPoint(int point) {
		if (point >= 0 && point <= 100) {
			this.point = point;
		}
	}
	
	void showInfo() {
		System.out.println("점수: " + point);
	}
}
public class C052_Accessor2 {
	public static void main(String[] args) {
		Score s = new Score(90); // Score(int point)이니 ()안에 점수를 넣어야함
		s.showInfo();
		
		s.setPoint(150);		// 잘못된 값
		s.showInfo();
		
		s.setPoint(75);			// 정상 값
		s.showInfo();
		
		System.out.println("현재 점수: " + s.getPoint());
	}
}
