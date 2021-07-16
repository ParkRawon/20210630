package co.yedam.pilates;

import java.util.Scanner;

public class PilatesApp { 
	
	private static PilatesApp singleton = new PilatesApp();
	
	private PilatesApp() {	
	}
	
	public static PilatesApp getInstance() {
		return singleton;
	}
	
	 Member[] members = new Member[10];
	 Scanner scn = new Scanner(System.in);

	public void main() {
		// 초기 데이터 생성 이유 : 테스트 데이터 입력하는 수고를 줄이기 위해.
		members = new Member[] { new Member(1, "Park", "01071872141", "951029", Gender.WOMEN),
				new Member(2, "Hong", "01099998888", "900101", Gender.WOMEN),
				new Member(3, "Choi", "01022225555", "920415", Gender.MEN),
				new Member(4, "Choi", "01088885555", "920704", Gender.MEN) };

		// 1.(신규회원)입력, 2.(연락처)수정, 3.삭제, 4.회원리스트, 5.이름조회, 6.상세조회, 9.종료
		while (true) {
			showMenu();
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				memberAdd();
			} else if (menu == 2) {
				memberedict();
			} else if (menu == 3) {
				memberDelete();
			} else if (menu == 4) {
				memberList();
			} else if (menu == 5) {
				searchByName();
			} else if (menu == 9) {

			}
			System.out.println("프로그램이 종료되었습니다.");
		}
	}// end

	public void memberDelete() {
		int delId = scanInt("삭제할 회원번호을 입력하세요>>>");
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMemberId() == (delId)) {
				members[i] = null;
				System.out.println("삭제 완료.");
				break;
			}
		}
	}

	public void memberedict() {
		int Id = scanInt("변경할 회원번호 입력>>>");
		boolean exist = false;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMemberName().equals(Id)) {
				exist = true;
				String name = scanString("변경할 이름 입력>>>");
				String phone = scanString("변경할 전화번호 입력>>>");
				String birth = scanString("변경할 생일 입력>>>");
				if (!name.equals("")) {
					members[i].setMemberName(name);
				}
				if (!phone.equals("")) {
					members[i].setMemberPhone(phone);
				}
				if (!birth.equals("")) {
					members[i].setMemberBirth(birth);
				}
			}
		}
	}

	public void searchByName() {
		String name = scanString("조회할 이름을 입력하세요>>>");
		boolean exist = false; // 회원정보가 있는지 체크.
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMemberName().equals(name)) {
				System.out.println(members[i].showInfo());
				exist = true;
			}
		}
		if (!exist) {
			System.out.println("조회한 이름이 없습니다.");
		}
	}

	public void memberList() {
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) // null이 아닌 경우만 출력
				System.out.println(members[i].showInfo());
		}
	}

	public void memberAdd() {
		String name = scanString("이름을 입력하세요>>>");
		String phone = scanString("연락처를 입력하세요>>>");
		String birth = scanString("생일을 입력하세요>>>");
		Gender gender = scanGen("성별을 입력하세요(1:남 2:여)>>>");

		Member member = new Member(getNextId(), name, phone, birth, gender);

		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) { // 입력시 비워져 있는 곳에 입력.
				members[i] = member;
				break; // 비워있는 위치에 한건 입력 후 종료.
			}
		}
	}

	public String scanString(String arg) { // 입력메세지 출력 후 문자입력값을 반환해준다.
		System.out.print(arg);
		String val = scn.nextLine();
		return val;
	}

	public int scanInt(String arg) { // 입력메세지 출력 후 int반환.
		int val = 0;
		while (true) {
			try {
				System.out.print(arg);
				val = scn.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("숫자만 입력가능 합니다.");
				scn.nextInt();
			}
		}
		return val;
	}

	public Gender scanGen(String arg) { // 입력메세지 출력 후 Gender 반환.
		Gender gender = null;
		while (true) {
			try {
				System.out.print(arg);
				int gen = scn.nextInt(); // 예외가 발생하면 에러메세지 출력 후 다시 입력 메세지.
				if (gen == 1) {
					gender = Gender.MEN;
				} else if (gen == 2) {
					gender = Gender.WOMEN;
				} else {
					System.out.println("1 또는 2 입력하세요.");
					continue; // 반복문을 탈출 못하도록.
				}
				break;
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요.");
				scn.nextLine();
			}
		}
		return gender;
	}

	public int getNextId() {
		// 회원번호 가입순번 => 1,2,3..
		int memberId = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) { // 현재 멤버아이디 중에서 최고번호.
				if (members[i].getMemberId() > memberId) {
					memberId = members[i].getMemberId();
				}
			}
		}
		memberId++;
		return memberId;
	}

	public void showMenu() {
		System.out.println("-------------------------------------------------------");
		System.out.println("1.입력, 2.수정, 3.삭제, 4.회원리스트, 5.이름조회, 6.상세조회, 9.종료");
		System.out.println("-------------------------------------------------------");
		System.out.println("선택>>>");
	}
		
	}