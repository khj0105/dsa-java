package chapter.chapter07_Array;

/*
	[ 배열 ]
	- 같은 타입의 데이터를 하나의 변수로 여러 개를 지정할 수 있는 구조
 */
public class C058_Array1 {
	public static void main(String[] args) {
		// 1. 배열 선언 + 생성
		int[] arr1;			// 배열 선언
		arr1 = new int[5];	// 배열 생성, new라는 키워드는 참조형 변수를 따로 선언하지마 않으면 기본값 null, 0 을 준다.
		
		System.out.println("arr1[0] = " + arr1[0]);
		System.out.println("arr1[1] = " + arr1[1]);
		System.out.println();
		
		// 2. 배열 값 저장(초기화)
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;;
		arr1[3] = 40;
		arr1[4] = 50;
		
		System.out.println("배열 길이: " + arr1.length);
		
		System.out.println("배열 값 저장 후 출력");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		}
		System.out.println();
		
		// 3. 배열 선언 + 초기화
		int[] arr2;
		arr2 = new int[] {0, 1, 2, 3, 4, 5}; // new int[] 생략불가
		
		int[] arr3 = {0, 1, 2, 3, 4}; // 가능
		
		System.out.println("arr2 출력");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		// 4. 배열 값 변경
		arr2[2] = 100;
		System.out.println("값 변경 후");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
