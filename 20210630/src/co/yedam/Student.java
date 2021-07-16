package co.yedam;

public class Student {
	//이름,학년,영어점수,수학점수
	private String name = "박라원";
	private String grade = "삼학년";
	private int engScore = 85;
	private int mathScore = 50;
	
	public Student() {  //매개값이 생성자를 기본생성자.
		
	}
	
	public Student(String name) { // 매개값을 가지는 생성자.
		this.name = name;
	}
	public Student(String name, String grade) { 
		this.name = name;
		this.grade = grade;
	}	
	
	public Student(String name, String grade, int engScore, int mathScore) {
		this.name = name;
		this.grade = grade;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public String getInfo() {
		return "{이름: " + this.name + "학년: " + this.grade + " 영어점수: " + this.engScore + "수학점수: " + this.mathScore +"}";
	}

}
	

