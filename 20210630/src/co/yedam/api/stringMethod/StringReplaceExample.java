package co.yedam.api.stringMethod;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "�ڹٴ� ��ü�������Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "jAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
