package ch07.ex05sealed;

public final class Employee extends Person{
	@Override
	public void work() {
		System.out.println("생산직 입니다.");
	}
}
