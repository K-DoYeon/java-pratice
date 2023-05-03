package Test0419;

public class MemberExample {

	public static void main(String[] args) {
		
		// 객체 생성
		MemberService memberService = new MemberService();
		
		// 메소드 호출
		// 변수 rs에 로그인 할 id와 password를 담아
		boolean rs = memberService.login("ezen", "12345");
		
		// 조건 rs가 id, password가 맞다면 로그인 되었습니다 출력 후 로그아웃 출력 id, password가 틀렸다면 id,password가 올바르지 않습니다 출력
		if(rs) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("ezen");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}

	}

}
