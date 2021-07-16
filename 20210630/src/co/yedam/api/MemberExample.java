package co.yedam.api;

public class MemberExample {
	public static void main(String[] args) {
		Member original = new Member("�ڶ��",27,new int[] {90,90}, new Car("bmw"));
		
		Member cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "�ƿ��";
		
		System.out.println("[�������� �ʵ尪]");
		System.out.println("name: "+cloned.name);
		System.out.println("age: "+cloned.age);
		System.out.print("scores: {");
		for(int i = 0; i<cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i == (cloned.scores.length-1))?"":",");
		}
		
		System.out.println("}");
		System.out.println("car: "+cloned.car.model);
		
		System.out.println();
		
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("name: "+original.name);
		System.out.println("age: "+original.age);
		System.out.print("scores: {");
		for(int i = 0; i<original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i == (original.scores.length-1))?"":",");
		}
		
		System.out.println("}");
		System.out.println("car: "+original.car.model);

	}

}