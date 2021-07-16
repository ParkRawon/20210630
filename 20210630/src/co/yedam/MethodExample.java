package co.yedam;

public class MethodExample {
	public static String makeUsefulInfo(String str) {
		String[] info = str.split("");
		String name = info[0]; //홍길동
		String birth = info[1]; //19900101
		String phone = info[2];  //01012345678
		name = "이름: " + name;
		birth = "\n생일: " + birth.substring(0,4) + "년" + birth.substring(4,6) + "월" + birth.substring(6,8) + "일";
		phone = "\n전화: " + phone.substring(0,3) + "-" + phone.substring(3,7) + "-" + phone.substring(7,11);
		String result;
		result = name;
		result += birth;
		result += phone;
		
		//System.out.println("----------------------");
		//System.out.println(result);
		return result;		
	}
	
	public static void main(String[] args) {
		String str1 = new String("홍길동 19900101 01012345678");
		String result = makeUsefulInfo(str1);
		System.out.println(result);
		
		String str2 = new String("홍길동 19900101 01012345678");
		System.out.println(makeUsefulInfo(str2));
		
		String str3 =  new String("홍길동 19900101 01012345678");
		makeUsefulInfo(str3);
		
		System.out.println("시스템 종료");
	}
}
