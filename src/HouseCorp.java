
public class HouseCorp extends Corp{

	//只允许传进来房子类型的类
	public HouseCorp(House house) {
		super(house);
	}
	
	public void makeMoney() {
		super.makeMoney();
		System.out.println("房地产公司赚大钱了");
	}
}
