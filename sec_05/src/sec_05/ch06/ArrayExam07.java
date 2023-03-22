package sec_05.ch06;

public class ArrayExam07 {

	public static void main(String[] args) {
		//주민번호 길이 같은지 다른지
		
		String ssn = "010101-1234567";
		String nssn = ssn.replace("-", "");
		int length = nssn.length();
		if(length == 13) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		// 주민번호를 생년 번호와 뒷번호로 나누어 출력하라.
		
		String ssn2 = "010101-1234567";
		System.out.println("주민번호 앞자리는 : " + ssn2.substring(0,6));
		System.out.println("주민번호 뒷번호는 : " + ssn2.substring(7));
		
		String str = "떠들지 마세요";
		int index = str.indexOf("나쁜놈");
		if(index == -1) {
			System.out.println("찾는 문자가 없음");
		}else {
			System.out.println("찾은 문자 시작 번호" + index);
		}
		
		System.out.println("--------------------------");
		
		//str.contains("문자") -> true, false를 리턴함
		String subject = "자바 프로그램";
		
		int index2 = subject.indexOf("프로그램");
		
		String cutSubject = subject.substring(0, index2);
		System.out.println(cutSubject);
		
		System.out.println("--------------------------");
		
		int index3 = subject.indexOf("자바");
		
		if(index3 == -1) {
			System.out.println("자바와 관련없는 책");
		}else {
			System.out.println("자바와 관련된 책");
		}
		
		System.out.println("--------------------------");
		
		boolean contain = subject.contains("자바");
		
		if(contain == true) {
			System.out.println("자바와 관련된 책");
		}else {
			System.out.println("자바와 관련없는 책");
		}
		
		System.out.println("--------------------------");
		
		String a = "1,자바 학습,참조타입 String을 공부합니다.,홍길동";
		String [] b = a.split(",");
		
		System.out.println("번호 : " + b[0]);
		System.out.println("제목 : " + b[1]);
		System.out.println("내용 : " + b[2]);
		System.out.println("이름 : " + b[3]);
		

	}

}
