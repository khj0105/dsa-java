package chapter.chapter01_Data;

public class C006_DataType {
	
	public static void main(String[] args) {
		
		/*
				[ 데이터 타입 ]
				1. 기본형 데이터 타입
					- 정수형: byte(1), short(2), int(4), long(8), char(2)
					- 실수형: float(4), double(8)
					- 논리형: boolean(1)
					
				2. 참조형 데이터 타입
					- 기본형을 제외한 나머지 타입
					- String, 배열, 클래스, 등..
		 */
		
		// 1. 기본형 데이터타입
		byte	b = 127;
		short	s = 12345;
		int		i = 1234567890;
		long	l = 12345678900L;	// long l, L 작성 필수
		char	c = 'A';
		float	f = 3.14F;			// float f, F 작성 필수
		double	d = 3.14;
		boolean flag = true;		// true or false
		
		// 출력
		System.out.println("=== 기본형 데이터타입 추력 ===");
		System.out.println("byte	: " + b);
		System.out.println("short	: " + s);
		System.out.println("int		: " + i);
		System.out.println("long	: " + l);
		System.out.println("char	: " + c);
		System.out.println("float	: " + f);
		System.out.println("double	: " + d);
		System.out.println("boolean	: " + flag);
		
		// var	, 타입 추론
//		var v;		// 반드시 초기값이 있어야 함
		var v1 = 'B';
		var v2 = 123;
		var v3 = "문자열";
		
		// 한 줄 복사 단축키 ctrl + d
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
	}
	
}
