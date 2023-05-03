package sec_06.ch04;

public class KoreanExam {

	public static void main(String[] args) {
		// korean 객체 생성
		Korean k1 = new Korean("김철수","010-1234-5678");
		
		System.out.println("국적 : " + k1.nation);
		System.out.println("이름 : " + k1.name);
		System.out.println("전화번호 : " + k1.mobile);
		
		Korean k2 = new Korean("홍길동","010-1111-5678");
		
		System.out.println("국적 : " + k2.nation);
		System.out.println("이름 : " + k2.name);
		System.out.println("전화번호 : " + k2.mobile);
		
		Korean k3 = new Korean("이순이","010-2222-5678");
		
		System.out.println("국적 : " + k3.nation);
		System.out.println("이름 : " + k3.name);
		System.out.println("전화번호 : " + k3.mobile);

	}

}
