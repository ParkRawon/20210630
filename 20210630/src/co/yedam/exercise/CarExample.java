package co.yedam.exercise;

public class CarExample {
	public static void main(String[] args) {
		Car m1 = new Car(); 
		m1.setCarId(101);
		m1.setCarName("bmw");
		m1.setCarPrice(80000000);
		System.out.println(m1.getCarId() + "," + m1.getCarName()+ ","+m1.getCarPrice());
		Car m2 = new Car(102, "sm5",30000000);
		System.out.println(m2.getCarId()+","+m2.getCarName());
		Car m3 = new Car(103, "genesis", 70000000);
		System.out.println(m3.getCarId()+","+m3.getCarName()+","+m3.getCarPrice());
		
		
		Car[] cars = new Car[4];
		cars[0] = m1;
		cars[1] = m2;
		cars[2] = m3;
		cars[3] = null;
				
		for(int i = 0; i<cars.length; i++) {
			if (cars[i] != null) {
				System.out.println(cars[i].getCarId());
			}
		}
		
	}

}
