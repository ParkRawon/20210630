package co.yedam.account;

import java.util.Scanner;

public class Utils {
	static Scanner scn = new Scanner(System.in);

	// 사용자 입력값을 문자열로 반환.
	public static String scanString(String arg) { // 다른 클래스에서 사용가능
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
			System.out.println("숫자를 입력하세요.");
		}
		}
		return val;
	}

}