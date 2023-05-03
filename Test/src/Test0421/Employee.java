package Test0421;

public class Employee {
	// 이름, 직위, 급여 필드를 만들고 급여를 일정비율로 인상하고 계산하는 Employee 클래스를 작성하시오 (급여 + 급여 * 인상률/100)
	private String name;
	private String job;
	private double money;
	
	public Employee() {
		this.name = name;
		this.job = job;
		this.money = money;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	public void raiseSalary(double per) {
		money = money + money * per / 100;
	}
	
	public void printEmployee() {
		System.out.println("이름 : " + name);
		System.out.println("직책 : " + job);
		System.out.println("월급 : " + money);
	}

//	public static void main(String[] args) {
//		
//		Employee employee = new Employee("홍길동", "대리", 3000000);
//		
//		double a = employee.money * 0.5 + employee.money;
//		
//		
//		System.out.println(employee.name + employee.job + "의 월급은 = " + employee.money);
//		System.out.println(employee.name + employee.job + "의 인상된 월급은 = " + a);
//		
//	}
	
	
}
