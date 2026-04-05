package chapter.chapter01_Data;

public class C013_Casting {
	public static void main(String[] args) {
	
/*
		[ 강제 형 변환 (Explicit Casting) ]
		큰 타입 -> 작은 타입으로 변환할 때 개발자가 직접 형 변환 해야함
		(주의) 데이터 손실 위험이 있음.
		
		(변환하고자 하는 데이터타입) 변수
 */
		// double -> int
		double dNum = 3.14;
		int iNum = (int) dNum;
		
		System.out.println("double: " + dNum);
		System.out.println("int	: " + iNum);
		
		// 커서 다음 줄로 이동 단축키 shift + enter
		
		// int -> byte
		int iNum2 = 130;
		byte bNum = (byte) iNum2;
		
		System.out.println("int	 : " + iNum2);
		System.out.println("byte : " + bNum);
		
		// char 형변환
		int code = 65;
		char ch = (char) code;
		
		System.out.println("int	 : " + code);
		System.out.println("char : " + ch);
	}
}
