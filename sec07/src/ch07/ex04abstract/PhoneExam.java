package ch07.ex04abstract;

public class PhoneExam {

	public static void main(String[] args) {
		
		SmartPhone smartphone = new SmartPhone("홍길동");
		
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();

	}

}
