package practice.chapter10_Abstraction;

import java.util.Random;
import java.util.Scanner;

public class GameMain_Method {
	
	private static Scanner scan = new Scanner(System.in);
	private static Random ran = new Random();
	
	//메인 메뉴를 출력해주는 메서드
	public void printMenu() {
		System.out.println("""
				=== ABCDE_rpg ===
				1. 캐릭터 생성
				2. 캐릭터 정보
				3. 전직하기
				4. 기본 공격
				5. 스킬 사용
				0. 종료
				=================
				""");
		System.out.print("번호를 선택하세요 : ");
	}
	
	//출력 문구만 모아 놓은 메서드
	public void printText(int num) {
		switch (num) {
			case 1 -> System.out.println("게임을 종료합니다.");
			case 2 -> System.out.println("번호를 잘못 입력하셨습니다.");
			case 3 -> System.out.println("캐릭터를 생성하세요.");
			case 4 -> System.out.println("스킬을 배우지 않았습니다.");
		}
	}
	
	//캐릭터를 생성하는 메서드
	//스탯 힘, 민첩, 지능을 랜덤한 숫자로 스탯의 총 합이 15이상일 경우에만 부여한다.
	//사용자의 선택에 따라 저장 or 스탯 재부여 한다.
	public Novice createCharacter() {
		Novice novice = null;
		System.out.println("캐릭터를 생성합니다.");
		System.out.print("사용하실 아이디를 입력해 주세요 : ");
		String id = scan.next();
		int str = 0, dex = 0, intel = 0, sum = 0;
		
		while(true) {
			// 1~10 사이의 랜덤 스탯 생성
			str = ran.nextInt(10) + 1;
			dex = ran.nextInt(10) + 1;
			intel = ran.nextInt(10) + 1;
			sum = str + dex + intel;
			
			// 스탯 총합이 15 이상일 때만 사용자에게 물어봄
			if (sum >= 15) {
				System.out.printf("[힘: %d, 민첩: %d, 지능: %d (총합: %d)]\n", str, dex, intel, sum);
				System.out.print("이 스탯으로 결정하시겠습니까? (1.저장 / 2.다시부여) : ");
				int choice = scan.nextInt();
				
				if (choice == 1) {
					return new Novice(id, str, dex, intel);
				}
			}
		}//return novice; // sum이 15 미만이거나 choice가 2이면 while문의 처음으로 돌아가 다시 랜덤 스탯 생성
	}
	
	//직업에 따라 인스턴스를 생성하는 메서드
	//선택한 직업에 따라 해당 클래스로 인스턴스를 생성하고, 문구를 출력한다.
	public Novice jobSelect(int num, Novice novice) {
		Novice character = null;
			System.out.println("전직을 축하합니다!");
			
			// 기존 novice의 정보를 가져와서 새로운 직업 객체를 생성함 (데이터 유지)
			String name = novice.getName();
			int str = novice.getStrength();
			int dex = novice.getDexterity();
			int intel = novice.getIntelligence();
			
			return switch (num) {
				case 1 -> new Knight(name, str, dex, intel);
				case 2 -> new Thief(name, str, dex, intel);
				case 3 -> new Magician(name, str, dex, intel);
				default -> novice; // 잘못된 입력 시 그대로 유지
		};//return character;
	}
	
	//전직을 위해 번호를 입력받는 메서드
	public int numberInput() {
		int num = 0;
		while(num > 3 || num < 1) {
			System.out.println("=== 직업 종류 ===");
			System.out.println("1. 기사");
			System.out.println("2. 도적");
			System.out.println("3. 마법사");
			System.out.print("전직할 직업의 번호를 선택하세요 : ");
			num = scan.nextInt();
		}
		return num;
	}
	
	//생성된 캐릭터의 정보를 보여 주는 메서드
	//생성된 인스턴스에 따라 직업표시가 달라진다.
	public void characterInfo(Novice novice) {
		if (novice == null) { printText(3); return; }
		System.out.println("===== 캐릭터 정보 =====");
		System.out.println("이름 : " + novice.getName());
		System.out.println("직업 : " + novice.getJob());
		System.out.println("힘 : " + novice.getStrength() + " / 민첩 : " + novice.getDexterity() + " / 지능 : " + novice.getIntelligence());
	}
	
}