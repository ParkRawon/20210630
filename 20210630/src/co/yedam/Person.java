package co.yedam;

public class Person {
	// 이름 ,나이, 키, 혈액형(bloodType != bloodtype)
	private String name = "박라원"; // private=속성숨김
	private int age = 27;
	private double height = 161.0;
	private String bloodType = "A";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public void showInfo() {
		System.out.println(
				"[이름: " + this.name + "나이: " + this.age + " 키: " + this.height + "혈액형: " + this.bloodType + "]");
	}

	public String getInfo() {
		return "{이름: " + this.name + "나이: " + this.age + " 키: " + this.height + "혈액형: " + this.bloodType + "}";
	}

	public int getSum(int n1, int n2) {
		return n1 + n2;
	}

	// 10~20 사이의 임의의 값을 생성해주는 메소드.
    public int getFrom10To20() {
    	return (int) (Math.random()*10)+10;
    }
    public int getFromTo(int n1,int n2) {
    	return (int) (Math.random()*(n2-n1))+n1;
    }
    //매개값으로 문자(이름),숫자(나이) => 제이름은 ??이고 나이는 ??입니다.
    //getNameAndAge()
  
     public String getNameAndAge(String name,int age) {
    	 return "제이름은" +name+"이고"+ "나이는"+ age+"입니다.";
     }
     
     public Person createNewPerson(String name, int age) {
    	 Person psn = new Person(); 
    	 psn.setName(name);
    	 psn.setAge(age);
    	 return psn;
     }
     public Person createNewPerson(String name, int age,  double height) {
    	 Person psn = new Person(); 
    	 psn.setName(name);
    	 psn.setAge(age);
    	 psn.setHeight(height);
    	 return psn;     
     }  
     public Person createNewPerson(String name, int age,  double height, String bloodType) {
    	 Person psn = new Person(); 
    	 psn.setName(name);
    	 psn.setAge(age);
    	 psn.setHeight(height);
    	 psn.setBloodType(bloodType);
    	 return psn;  
     }
}