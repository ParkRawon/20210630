package co.yedam.api;

import java.text.MessageFormat;

public class MessageFormatExample {
	public static void main(String[] args) {
		String data = "ȸ��ID: {0} \nȸ�� �̸�: {1} \n�п� ��ȭ: {2}";
		System.out.println(MessageFormat.format(data,"123", "�ڶ��", "1234-5678"));
		
		System.out.format("ȸ��ID: %s \nȸ���̸�: %s \n�п���ȭ: %s \n","123","�ڶ��", "5678-9123");
	}
	

}
