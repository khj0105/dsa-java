package chapter.chapter01_Data;

public class C011_TextBlock {
	public static void main(String[] args) {
/*
		[ 텍스트 블록 (Text Block) ]
		java 15 이상
		""" 로 여러 줄 문자열을 작성할 수 있음
		
		특징
		1. 여러 줄 문자열을 쉽게 작성
		2. 자동 줄바꿈 처리
		3. 따음표 escape 필요 없음
		4: HTML / JSON / SQL 작성에 매우 편리
 */
		
		// 텍스트 블록 방식
		String textBlock = """
				이름: "김상형"
				나이: 59
				직업: '프로그래머'
				""";
		System.out.println(textBlock);
		
		// SQL 작성 예시
		String sql = """
				SELECT *
				FROM users
				WHERE age > 20
				ORDER BY name
				""";
		System.out.println(sql);
		
		// formatted()
		// 문자열 포맷 기능
		String name = "홍길동";
		int age = 30;
		
		String message = """
				이름: %s
				나이: %d
				""".formatted(name, age);
		System.out.println(message);
	}
}
