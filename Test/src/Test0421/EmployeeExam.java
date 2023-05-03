package Test0421;

public class EmployeeExam {
	
	public static void main(String[] args) {
		Employee em = new Employee();
		
		em.setName("홍길동");
		em.setJob("대리");
		em.setMoney(5000);
		
		em.printEmployee();
		System.out.println("1년 후 ...");
		
		em.raiseSalary(10);
		em.printEmployee();
		
		
	}

}
