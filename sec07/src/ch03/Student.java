package ch03;

public class Student extends People {
	
	public int num;
	
	// 생성자
	
	public Student(String name, String ssn, int num) {
		super(name, ssn);
		this.num = num;
		
		System.out.println("학생객체 생성 완료");
	}
	
}
