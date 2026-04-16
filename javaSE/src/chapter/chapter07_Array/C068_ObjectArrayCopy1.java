package chapter.chapter07_Array;

public class C068_ObjectArrayCopy1 {
	public static void main(String[] args) {
		// 얕은 복사
		
		Book[] books1 = {
			new Book("태백산맥", "조정래"),
			new Book("데미안", "헤르만 헤세"),
			new Book("자바", "홍길동"),
		};
		
		Book[] books2 = new Book[3];
		
		// 객체 배열 복사
		for (int i = 0; i < books1.length; i++) {
			books2[i] = books1[i];
		}
		System.out.println("=== books1 출력 ===");
		for (Book b : books1) {
			b.showInfo();
		}
		System.out.println();
		for (Book b : books2) {
			b.showInfo();
		}
		
		System.out.println("=== 같은 객체를 참조하는지 확인 ===");
		System.out.println(books1[0] == books2[0] ? "같은 객체 참조" : "다른 객체 참조");
		
		books2[0].title = "토지";
		for (Book b : books1) {
			b.showInfo();
		}
		System.out.println();
		for (Book b : books2) {
			b.showInfo();
		}
	}
}
