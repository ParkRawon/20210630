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

//�����͸� ��Ƴ������� Account
//��Ʈ�� �Ա�, ��� => ������� �Է����� �޴��� ����.
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

	private void printMenu() { // �޴�����
		System.out.println("--------------------------------------------------");
		System.out.println("1.���»��� 2.���¸�� 3.���� 4.��� 5.�������� 6.���Ͽ��� 7.����");
		System.out.println("--------------------------------------------------");
		System.out.println("����>");
	}// end of printMenu()

	private void createAccount() { // ���»���

		String ano = Utils.scanString("���¹�ȣ �Է�>>>>");

		System.out.println("������ �Է�>>>");
		String owner = scn.nextLine();
		System.out.println("�ݾ� �Է�>>>");
		String amount = scn.nextLine(); // "1000" -> 1000
		Account acnt = new Account(ano, owner, Integer.parseInt(amount));
//		acnt.setAno(ano);
//		acnt.setOwner(owner);
//		acnt.setBalance(Integer.parseInt(amount)); //���ڿ����� -> int ����

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = acnt;
				System.out.println("�Ѱ� �ԷµǾ����ϴ�.");
				break; // ����ִ� ��ġ�� �Ѱ� �Է��� ����.
			}
		}
	}// end of createAccount()

	private void accountList() { // ���¸��
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				System.out.println("account���� = " + accounts[i].getAno() + " " + accounts[i].getOwner() + " "
						+ accounts[i].getBalance());
			}
		}
	} // end of accountList()

	// ���¹�ȣ(ano)������ �Է� �ϸ� �ش���¸� ��ȯ���ִ� �޼ҵ�.
	private Account findAccount(String ano) { // ����ã��
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAno().equals(ano)) { // �Ȱ��� ���¹�ȣ�� ������ return
				return accounts[i];
			}
		}
		return null;

	}// end of findAccount

	private void deposit() { // ����
		System.out.println("���¹�ȣ>>>");
		String ano = scn.nextLine();
		Account acnt = findAccount(ano);
		if (acnt == null) {
			System.out.println("�ش���°� �����ϴ�.");
		} else {
			String amt = Utils.scanNumberString("������ �ݾ��� �Է��ϼ���>>>");
			int balance = acnt.getBalance();
			acnt.setBalance(balance + Integer.parseInt(amt));
		}
	}// end of deposit

	// ���ó��
	private void withdraw() {
		System.out.println("���¹�ȣ>>>");
		String ano = scn.nextLine();
		Account acnt = findAccount(ano);
		if (acnt == null) {
			System.out.println("�ش���°� �����ϴ�.");
		} else {
			System.out.println("��ݾ��� �Է��ϼ���>>>");
			String amt = scn.nextLine();
			int balance = acnt.getBalance();
			acnt.setBalance(balance - Integer.parseInt(amt)); // Integer.parseInt() => ���ڿ��� ���ڿ��� �ٲ��� ex)"1000"->1000
		}
	}

	private void fileOpen() { //���Ͽ���
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

	private void fileSave() {  //��������
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
		// 1.���»��� 2.���¸�� 3.���� 4.��� 5.����
		while (run) {
			printMenu();
			int selectNo = scn.nextInt();
			scn.nextLine();
			if (selectNo == 1) {
				System.out.println("���»���");
				createAccount();
			} else if (selectNo == 2) {
				System.out.println("���¸��");
				accountList();
			} else if (selectNo == 3) {
				System.out.println("����");
				deposit();
			} else if (selectNo == 4) {
				System.out.println("���");
				withdraw();
			} else if (selectNo == 5) {
				System.out.println("��������");
				fileSave();
			} else if (selectNo == 6) {
				System.out.println("���Ͽ���");
				fileOpen();
			} else if (selectNo == 7) {
				System.out.println("���α׷� ����.");
				run = false;
			}
		}
	}

}
