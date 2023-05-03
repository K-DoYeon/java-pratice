package ch03;

public class StudentExam {

	public static void main(String[] args) {
		
		Student student = new Student("홍길동","1234567-123456",14);
		System.out.println("이름 : " + student.name);
		System.out.println("주민번호 : " + student.ssn);
		System.out.println("학생번호 : " + student.num);
		
	}

}
