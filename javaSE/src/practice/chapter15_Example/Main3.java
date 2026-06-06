package practice.chapter15_Example;

import java.util.Scanner;

public class Main3 {// Main은 프로그램의 시작, UI호출
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Service3 dsaService = new Service3();
		
		while (true) {
			dsaService.mainMenu();
			int num = scan.nextInt();
			
			switch (num) {
				case 1 -> dsaService.insertStudent();
				case 2 -> dsaService.updateScore();
				case 3 -> dsaService.selectStudent();
				case 4 -> dsaService.selectAll();
				case 5 -> dsaService.selectRank();
				case 0 -> {
					System.exit(0);
				}
				default -> System.out.println("** 다시 선택하세요. **");
			}
		}
	}
}
