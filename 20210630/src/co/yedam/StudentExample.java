package co.yedam;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("박라원");
		s1.setGrade("삼학년");
		s1.setEngScore(85);
		s1.setMathScore(50);

		Student s2 = new Student();
		s2.setName("박하림");
		s2.setGrade("이학년");
		s2.setEngScore(80);
		s2.setMathScore(60);

		Student s3 = new Student();
		s3.setName("박지은");
		s3.setGrade("일학년");
		s3.setEngScore(75);
		s3.setMathScore(65);

		Student[] students = { s1, s2, s3 };
//		students =new Student[] {s1, s2, s3};
		int sum = 0;
		double avg = 0;
		int maxEng = 0;
		Student maxStudent = null;
		// 배열선언 후 s1,s2,s3값을 저장.
		// 배열의 요소중에서 영어점수가 최고인 점수를 출력.
		for (int i = 0; i < students.length; i++) {
			if (students[i].getEngScore() > maxEng) {
				maxEng = students[i].getEngScore();
				  maxStudent = students[i];
				//sum += students[i].getEngScore();
				
			}
			//avg = (double) sum / students[i].getEngScore();
		}
		System.out.println("영어최고" + maxStudent );
	}

}