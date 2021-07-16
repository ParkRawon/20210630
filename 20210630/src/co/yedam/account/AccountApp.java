package co.yedam.account;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Scanner;

//데이터를 담아놓기위한 Account
//컨트롤 입금, 출금 => 사용자의 입력으로 메뉴를 실행.
public class AccountApp {
	private static AccountApp app = new AccountApp();

	private AccountApp() {

	}

	public static AccountApp getInstance() {
		return app;
	}

	Account[] accounts = new Account[10];
	Scanner scn = new Scanner(System.in);
	File file = new File("accountList.txt");

	private void printMenu() { // 메뉴생성
		System.out.println("--------------------------------------------------");
		System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.파일저장 6.파일열기 7.종료");
		System.out.println("--------------------------------------------------");
		System.out.println("선택>");
	}// end of printMenu()

	private void createAccount() { // 계좌생성

		String ano = Utils.scanString("계좌번호 입력>>>>");

		System.out.println("예금주 입력>>>");
		String owner = scn.nextLine();
		System.out.println("금액 입력>>>");
		String amount = scn.nextLine(); // "1000" -> 1000
		Account acnt = new Account(ano, owner, Integer.parseInt(amount));
//		acnt.setAno(ano);
//		acnt.setOwner(owner);
//		acnt.setBalance(Integer.parseInt(amount)); //문자열숫자 -> int 숫자

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = acnt;
				System.out.println("한건 입력되었습니다.");
				break; // 비어있는 위치에 한건 입력후 종료.
			}
		}
	}// end of createAccount()

	private void accountList() { // 계좌목록
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				System.out.println("account정보 = " + accounts[i].getAno() + " " + accounts[i].getOwner() + " "
						+ accounts[i].getBalance());
			}
		}
	} // end of accountList()

	// 계좌번호(ano)정보를 입력 하면 해당계좌를 반환해주는 메소드.
	private Account findAccount(String ano) { // 계좌찾기
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAno().equals(ano)) { // 똑같은 계좌번호가 있으면 return
				return accounts[i];
			}
		}
		return null;

	}// end of findAccount

	private void deposit() { // 예금
		System.out.println("계좌번호>>>");
		String ano = scn.nextLine();
		Account acnt = findAccount(ano);
		if (acnt == null) {
			System.out.println("해당계좌가 없습니다.");
		} else {
			String amt = Utils.scanNumberString("예금할 금액을 입력하세요>>>");
			int balance = acnt.getBalance();
			acnt.setBalance(balance + Integer.parseInt(amt));
		}
	}// end of deposit

	// 출금처리
	private void withdraw() {
		System.out.println("계좌번호>>>");
		String ano = scn.nextLine();
		Account acnt = findAccount(ano);
		if (acnt == null) {
			System.out.println("해당계좌가 없습니다.");
		} else {
			System.out.println("출금액을 입력하세요>>>");
			String amt = scn.nextLine();
			int balance = acnt.getBalance();
			acnt.setBalance(balance - Integer.parseInt(amt)); // Integer.parseInt() => 문자열을 숫자열로 바꿔줌 ex)"1000"->1000
		}
	}

	private void fileOpen() { //파일열기
		Reader is = null;
		try {
			//is = new FileInputStream(file);
			is = new FileReader(file);
			int readByte = 0;
			StringBuffer sb = new StringBuffer(); // str += newStr;		
			while ((readByte = is.read()) != -1) {
				sb.append((char) readByte);
			}
			String[] acnts = sb.toString().split("\n");
			for (int i = 0; i < acnts.length; i++) {
				String[] acnt = acnts[i].split(",");
				accounts[i] = new Account(acnt[0], acnt[1], Integer.parseInt(acnt[2]));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void fileSave() {  //파일저장
		OutputStream os = null;
		try {
			os = new FileOutputStream(file);
			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i] != null) {
					Account account = accounts[i];
					String val = account.getAno() + "," + account.getOwner() + "," + account.getBalance() + "\n";
					os.write(val.getBytes());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.flush();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void exe() {
		boolean run = true;
		// 1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료
		while (run) {
			printMenu();
			int selectNo = scn.nextInt();
			scn.nextLine();
			if (selectNo == 1) {
				System.out.println("계좌생성");
				createAccount();
			} else if (selectNo == 2) {
				System.out.println("계좌목록");
				accountList();
			} else if (selectNo == 3) {
				System.out.println("예금");
				deposit();
			} else if (selectNo == 4) {
				System.out.println("출금");
				withdraw();
			} else if (selectNo == 5) {
				System.out.println("파일저장");
				fileSave();
			} else if (selectNo == 6) {
				System.out.println("파일열기");
				fileOpen();
			} else if (selectNo == 7) {
				System.out.println("프로그램 종료.");
				run = false;
			}
		}
	}

}
