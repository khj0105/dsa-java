package chapter.chapter07_Array;

import java.util.Arrays;

/*
	[ 배열 복사 방법 ]
	- 배열 복사는 "새 배열을 만들어 값을 옮기는 것"
 */
public class C067_ArrayCopy2 {
	public static void main(String[] args) {
		
		int [] array1 = {1, 2, 3, 4, 5};
		int newLength = 10;
		
		System.out.println("원본  배열");
		System.out.println("array1: " + Arrays.toString(array1));
		System.out.println();
		
		// 1. System.arraycopy()
		// System.arraycopy(복사할 배열, 복사할 첫위치, 대상 배열, 붙여 넣을 첫 위치, 복사할 요소 개수)
		System.out.println("=== 1. System.arraycopy() ===");
		int[] array2 = new int[newLength];
		System.arraycopy(array1, 0, array2, 0, array1.length);
		System.out.println("array2: " + Arrays.toString(array2));
		System.out.println();
		
		// 2. Arrays.copyOf()
		// Arrays.copyOf(원본배열, 원본 배열에서 복사해올 길이)
		System.out.println("=== 2. Arrays.copyOf() ===");
		int[] array3 = Arrays.copyOf(array1, newLength);
		System.out.println("array3 : " + Arrays.toString(array3));
		System.out.println("array3 : " + array3);
		System.out.println(array1 == array3);
		
		// 3. for문 복사
		System.out.println("=== 3. for문을 이용한 복사 ===");
		int[] array4 = new int[newLength];
		for (int i = 0; i < array1.length; i++) {
			array4[i] = array1[i];
		}
		System.out.println("array4: " + Arrays.toString(array4));
		System.out.println();
		
		System.out.println("=== 값 변경 후 확인 ===");
		array1[0] = 100;
		
		System.out.println("array1: " + Arrays.toString(array1));
		System.out.println("array2: " + Arrays.toString(array2));
		System.out.println("array3: " + Arrays.toString(array3));
		System.out.println("array4: " + Arrays.toString(array4));
	}
}
