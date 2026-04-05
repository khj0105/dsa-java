package chapter.chapter00_basic;


/**
 * JavaDoc 주석은 클래스 or 메서드의 설명을 문서 형태로 만들때 사용
 * <p style="color: red">javaDoc 주석은 HTML 문서로 만들어짐</p>
 *
 * @author kky
 * @version 1.0
 */
public class C001_Comment {
	
	public static void main(String[] args) {
		
		// 출력을 도와주는 메서드
		System.out.println("점심시간임");
		
		// 1. 한 줄 주석
		// 한 줄 설명을 작성할 대 사용
		// 단축키 ctrl + /
		
		// 2. 여러 줄 주석
		/*	주석 시작
			단축키 ctrl + shift + /
			한 줄 삭제 ctrl + y
			
			주석 종료
		 */
		
		// 3. JavaDoc 주석
		/**
		 * 여러 줄 주석
		 * @param args 커맨드 라인 인수
		 */
		
	}
}