package co.yedam;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person(); // 이름 ,나이, 키, 혈액형
		p1.setName("박라원"); // p1.name = "박라원";
		p1.setAge(27);// p1.age = 27;
		p1.setHeight(161.0);// p1.height = 161.0;
		p1.setBloodType("B");// p1.bloodType = "A";

		Person p2 = new Person();
		p2.setName("박하림"); // p2.name = "박라원";
		p2.setAge(29); // p2.age = 25;
		p2.setHeight(160.0); // p2.height = 165.3;
		p2.setBloodType("A"); // p2.bloodType = "O";

		// 새로운 인스턴스 (사람) 선언: 여러분의 정보를 담아서 p3 만들어보세요.
		Person p3 = new Person();
		p3.setName("박지은");// p3.name = "박하림";
		p3.setAge(26);// p3.age = 23;
		p3.setHeight(168.0);// p3.height = 167.5;
		p3.setBloodType("AB");// p3.bloodType = "A";
		Person[] persons = { p1, p2 ,p3};
		//persons = new Person[] { p1, p2, p3 };

		for (int i = 0; i < persons.length; i++) {
			// 혈액형이 A인 사람만 조회.
			if (persons[i].getAge() >= 25) {
				//persons[i].showInfo();
				System.out.println(persons[i].getInfo());
			}
		}
		// System.out.println(p1.name + "," + p1.age + ","+p1.height);
	}

}