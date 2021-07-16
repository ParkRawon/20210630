package co.yedam.exercise;

public class Employee {
	//사원으로 만들겠다.
	//사원번호 
	//이름
	//이메일
	//급여
	//부서
	
	//메소드 정의
	//get,set
	
	private int empNumber;
	private String empName;
	private String empEmail;
	private String empMoney;
	private String empdepartment;
	
	
	public Employee(int empNumber, String empName, String empEmail, String empMoney, String empdepartment) {
		super();
		this.empNumber = empNumber;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empMoney = empMoney;
		this.empdepartment = empdepartment;
	}
	
	
	public int getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpMoney() {
		return empMoney;
	}
	public void setEmpMoney(String empMoney) {
		this.empMoney = empMoney;
	}
	public String getEmpdepartment() {
		return empdepartment;
	}
	public void setEmpdepartment(String empdepartment) {
		this.empdepartment = empdepartment;
	}

	public String showInfo() {
		String info = "사원번호: " + empNumber + " 사원이름: " + empName + " 이메일: " + empEmail ;
		return info;
	}

}