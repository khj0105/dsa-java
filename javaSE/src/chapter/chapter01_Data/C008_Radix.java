package chapter.chapter01_Data;

public class C008_Radix {
	
	public static void main(String[] args) {
/*
		[ 기수 / 진수 ]
		일반적으로 사용하는 숫자 체계 = 10진수
		컴퓨터는 2진수 기반으로 동작한다.
		8진수, 16진수(RGB색상 코드)
		
		10진수 : 그냥 숫자 작성
		8진수  : 숫자 앞에 0
		16진수 : 0x 또는 0X
		2진수  : 0b 또는 0B
 */
		int a = 10;		// 10진수
		int b = 015;	// 8진수
		int c = 0x10;	// 16진수
		int d = 0b1001;	// 2진수
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		// 16진수 숫자 표현
		// A = 10, B = 11, C = 12, D = 13, E = 14, F = 15
		int hex = 0xA;
		System.out.println(hex);
	}
}
