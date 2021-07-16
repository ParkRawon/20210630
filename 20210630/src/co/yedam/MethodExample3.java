package co.yedam;

public class MethodExample3 {
	public static void main(String[] args) {
		Student s1 = new Student("박라원", "일학년", 80, 85);
		Student s2 = new Student("박하림", "이학년", 70, 75);
		Student[] javaClass = { s1, s2, new Student("박지은", "이학년", 85, 70) };
//		s1.setName("박라원");
//		s1.setGrade("일학년");
//		s1.setEngScore(80);
//		s1.setMathScore(85);
		for (int i = 0; i < javaClass.length; i++)	{
			if (javaClass[i].getGrade() == "이학년") {
				System.out.println(javaClass[i].getName() + "," + javaClass[i].getGrade() + "," 
			    + javaClass[i].getEngScore() + "," + javaClass[i].getMathScore());
			}
		}
	}

}