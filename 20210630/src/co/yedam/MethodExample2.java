package co.yedam;

public class MethodExample2 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("홍길동");

		String name = p1.getName();
		int n1 = p1.getSum(10, 20);
		int n2 = p1.getSum(5, 5);
		int result = p1.getSum(n1, n2);

		System.out.println("결과: " + result);

		// 10~20
		n1 = p1.getFrom10To20();
		System.out.println("10~20: " + n1);
		n2 = p1.getFromTo(10, 30);
		System.out.println("10~20: " + n2);

		// p1.getNameAndAge("홍길동", 20);
		String nameAndAge = p1.getNameAndAge("홍길동", 20);
		System.out.println(nameAndAge);

		Person newPerson = p1.createNewPerson("박라원", 27);
		newPerson.setHeight(160.8);
		newPerson.setBloodType("A");
		System.out.println(newPerson.getInfo());

		Person anotherPerson = p1.createNewPerson("박하림", 23, 161.0);
		System.out.println(anotherPerson.getInfo());
		
		Person theOtherPerson = p1.createNewPerson("박하림", 24, 161.0,"B");
		System.out.println(theOtherPerson.getInfo());
		
	}

}