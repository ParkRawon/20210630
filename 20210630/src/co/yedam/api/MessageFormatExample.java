package co.yedam.api;

import java.text.MessageFormat;

public class MessageFormatExample {
	public static void main(String[] args) {
		String data = "회원ID: {0} \n회원 이름: {1} \n학원 전화: {2}";
		System.out.println(MessageFormat.format(data,"123", "박라원", "1234-5678"));
		
		System.out.format("회원ID: %s \n회원이름: %s \n학원전화: %s \n","123","박라원", "5678-9123");
	}
	

}
