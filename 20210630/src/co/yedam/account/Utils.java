package co.yedam.account;

import java.util.Scanner;

public class Utils {
	static Scanner scn = new Scanner(System.in);

	// ����� �Է°��� ���ڿ��� ��ȯ.
	public static String scanString(String arg) { // �ٸ� Ŭ�������� ��밡��
		System.out.print(arg);
		String val = scn.nextLine();
		return val;
	}
	

	public static String scanNumberString(String arg) {
		String val = "";
		while (true) {
		System.out.print(arg);
		val = scn.nextLine();
		try {
			Integer.parseInt(val);
			break;
		} catch (Exception e) {
			System.out.println("���ڸ� �Է��ϼ���.");
		}
		}
		return val;
	}

}