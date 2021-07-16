package co.friend.common;

import java.util.Scanner;

import co.friend.model.Friend;

public class ScannerUtil {
	static Scanner scn = new Scanner(System.in);
	
	//����, �̸�, ��ȭ
	public static Friend readFriend() {
		System.out.println("����,�̸�,��ȭ>>>");
		String input = scn.next();
		String[] inputs = input.split(",");
		return new Friend(inputs[0], inputs[1], inputs[2]);
	}
	// ������� �Է� �޼��� -> ����,����
	public static String readString(String prompt) {
		System.out.println(prompt);

		return readString();
	}

	public static String readString() {
		String msg = null;
		try {
			msg = scn.nextLine();
		} catch (Exception e) {
			System.out.println("�����ڿ��� �����ϼ���.");
		}
		return msg;
	}

	public static int readInt(String prompt) {
		System.out.print(prompt);
//int menu = readInt();
//return menu;
		return readInt();
	}

	public static int readInt() {
		int val = 0;
		while (true) {
			try {
				val = scn.nextInt();  //
				scn.nextLine();
				break;
			} catch (Exception e) {
				System.out.println("���ڸ� �Է��ϼ���.");
				scn.nextLine();
			}
		}
		return val;

	}
}
