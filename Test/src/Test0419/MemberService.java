package Test0419;

public class MemberService {
	
	// 필드
	// id와 password 변수 선언
	String id;
	String password;
	
	// 메소드
	// login 했을때 만약 id가 ezen이고 password가 12345이면 true를 반환하고 아니라면 false를 반환
	boolean login(String id, String password) {
		if(id == "ezen" && password == "12345") {
			return true;
		}else {
			return false;
		}
	}
	
	//logout 메소드
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
