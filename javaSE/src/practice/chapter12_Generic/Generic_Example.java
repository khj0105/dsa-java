package practice.chapter12_Generic;

import java.util.Random;
import java.util.Scanner;

/*
    [ 점심메뉴 고르기 ]

    제네릭 클래스 Picker<T>를 이용하여
    사용자가 입력한 메뉴 목록 중 하나를 랜덤으로 뽑는 프로그램을 작성하시오.

    -------------------------------
    * 요구사항
    1. 사용자에게 메뉴 개수를 입력받는다.
    2. 입력한 개수만큼 메뉴 이름을 입력받아 배열에 저장한다.
    3. 제네릭 클래스 Picker<T>를 이용하여 메뉴를 저장한다.
    4. pick() 메서드를 호출하여 랜덤으로 하나의 상품을 출력한다.

    -------------------------------
    * 실행 예시
    상품 개수 입력 : 5
    상품 이름 입력 : 짜장면
    상품 이름 입력 : 김치찌개
    상품 이름 입력 : 초밥
    상품 이름 입력 : 쌀국수
    상품 이름 입력 : 맨밥

    ===== 상품 뽑기 =====
    뽑힌 상품 : 김치찌개

    -------------------------------
    * 구현 조건
    - 제네릭 클래스 Picker<T>를 사용한다.
    - 랜덤 선택은 Random 클래스를 사용한다.
    - 배열을 활용한다.

*/
public class Generic_Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 메뉴 개수 입력
		System.out.print("메뉴 개수 입력 : ");
		int count = sc.nextInt();
		sc.nextLine(); 		// 버퍼 비우기
		
		// 2. 메뉴 배열 생성
		String[] menu = new String[count];
		
		// 3. 메뉴 입력
		for (int i = 0; i < count; i++) {
			System.out.print("메뉴 입력 : ");
			menu[i] = sc.nextLine();
		}
		
		// 4. Picker 객체 생성
		Picker<String> picker = new Picker<>();
		picker.setItems(menu);
		
		// 5. 랜덤으로 메뉴 뽑기
		System.out.println("\n===== 메뉴 뽑기 =====");
		System.out.println("뽑힌 메뉴 : " + picker.pick());
		
	}
}

/*
    아래 Picker 클래스를 완성하시오.

    1. 제네릭 타입 T를 사용한다.
    2. 배열을 저장할 필드를 만든다.
    3. setItems() 메서드로 배열을 저장한다.
    4. pick() 메서드에서 랜덤으로 하나를 반환한다.
*/

class Picker<T> {
	
	private T[] items;
	
	// 배열 저장 메서드 작성
	void setItems(T[] items) {
		this.items = items;
	}
	
	// 랜덤으로 하나 뽑는 메서드 작성
	// 💡hint : T타입 배열인 items의 인덱스를 난수로 이용하여 리턴
	T pick() {
		Random r = new Random();
		int index = r.nextInt(items.length);
		return items[index];
	}
}