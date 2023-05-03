package ch10;

public class Television {
	
	static String Company = "Samsung";
	static String model = "OLED";
	static String info;
	static int OneSumten;
	
	static {
		info = Company + "-" + model;
		int sum = 0;
		for(int i = 0; i <= 10; i++) {
			sum += i;
		}
		OneSumten = sum;
	}

}
