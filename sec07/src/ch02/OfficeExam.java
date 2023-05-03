package ch02;

public class OfficeExam {

	public static void main(String[] args) {
		Employee im = new Employee();
		im.setName("임꺽정");
		im.setJobTitle("대리");
		System.out.println(im.toString());
		
		System.out.println("--------------------------------------");
		
		Manager mn = new Manager();
		mn.setName("홍길동");
		mn.setJobTitle("과장");
		
		mn.setManageJob("인사과");
		System.out.println(mn.toString());
		
		System.out.println("--------------------------------------");
		
		ManagerB mnb = new ManagerB();
		mnb.setName("홍학");
		mnb.setJobTitle("부장");
		
		mnb.setManageJob("인사과");
		System.out.println(mnb.toString());
	}

}
