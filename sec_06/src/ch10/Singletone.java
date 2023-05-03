package ch10;

public class Singletone {
	private static Singletone singletione = new Singletone();
	private Singletone() {}
	
	static Singletone getInstance() {
		return singletione;
	}

}
