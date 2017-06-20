
public class ShanZhaiCorp extends Corp{

	//依赖倒置，可以传进来任何实现Product接口或类的对象
	public ShanZhaiCorp(Product product) {
		super(product);
	}
	
	public void makeMoney() {
		super.makeMoney();
		System.out.println("山寨公司赚钱啦");
	}
}
