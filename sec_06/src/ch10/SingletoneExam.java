package ch10;

public class SingletoneExam {

	public static void main(String[] args) {
		// Singletone obj = new Singletone();
		Singletone obj = Singletone.getInstance();
		Singletone obj2 = Singletone.getInstance();
		
		if(obj == obj2) {
			System.out.println("같은 singletone 객체입니다.");
		}else {
			System.out.println("다름 singletone 객체입니다.");
		}

	}

}
