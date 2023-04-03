package Test0329;

public class MemberService {
	
	String id = "hong";
	String pw = "12345";
	
	public boolean login(String id, String pw) {
		if(this.id == id && this.pw == pw) {
			return true;
		}else {
			return false;
		}
	}
	public void logout(String id) {
		if(this.id == id) {
			System.out.println("로그아웃 되었습니다.");
		}
	}

}
