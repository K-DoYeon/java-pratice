package ch11;

public class PersonExam {

	public static void main(String[] args) {
		Person p1 = new Person("20000101-1234567","이순신");
		
		System.out.println(p1.nation);
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		
		p1.name = "홍길동";
		
		// p1.ssn = "123456-797456"; final 바꿀 수 없음
		System.out.println(p1.name);
		System.out.println(p1.ssn);

	}

}
