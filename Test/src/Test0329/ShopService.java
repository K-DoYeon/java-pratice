package Test0329;

public class ShopService {
	
	// 싱글톤 : 여러객체를 만들지 못하도록 막는것
	
	private static ShopService singletone = new ShopService();
	private ShopService() {}
	
	static ShopService getInstance() {
		return singletone;
	}

}
