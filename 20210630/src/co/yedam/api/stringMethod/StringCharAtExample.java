package co.yedam.api.stringMethod;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "980504-3234012";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("�����Դϴ�");
			break;
		case '2':
		case '4':
			System.out.println("�����Դϴ�");
			break;
		}
	}

}
