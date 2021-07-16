package co.yedam.inheritance;

public class StudentExample { //부모클래스
	public static void main(String[] args) {
		Student std = new Student();
		std.setName("학생1");
		std.setStudNo(100);
		System.out.println("Student:"+ std.getName()+","+std.getStudNo());
		
		HighStudent highStd = new HighStudent();
		highStd.setName("고등학생1");
		highStd.setStudNo(1001);
		highStd.setSchoolName("상원고등학교");
		System.out.println("HighStudent:"+highStd.getName()+","+highStd.getStudNo()+","+highStd.getSchoolName());
		
		Student[] students = new Student[3];
		students[0] = std;
		students[1] = highStd;  
		
		students[0].getName();
		students[0].getStudNo();
		if(students[0] instanceof HighStudent) {  //students[0] 의 인스턴스가 HighStudent의 것이 맞는지.
			HighStudent hsx = (HighStudent) students[0];
			hsx.getSchoolName();
		}
		students[0].showInfo();
		System.out.println(students[0].toString());
		
		students[1].getName();
		students[1].getStudNo();
//		students[1].getSchoolName();  //부모클래스에 상속되었기때문에 가져올수가 없다.그렇기문에 강제로 형변환을 해야한다.  int <- byte; 가능      
		if(students[1] instanceof HighStudent) {
			HighStudent hs = (HighStudent) students[1];
			hs.getSchoolName();
		}
		students[1].showInfo();
		System.out.println(students[1].toString());
	}

}