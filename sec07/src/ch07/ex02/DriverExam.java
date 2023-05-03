package ch07.ex02;

public class DriverExam {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Texi taxi = new Texi();
		
		driver.drive(bus);
		driver.drive(taxi);

	}

}
