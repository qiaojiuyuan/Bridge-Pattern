/**
 * 抽象公司类
 * @author qiaojy
 *
 */
public abstract class Corp {

	//定义一个抽象产品对象
	private Product product;
	
	//通过构造方法传递进来具体的产品
	public Corp(Product product) {
		this.product = product;
	}
	
	public void makeMoney() {
		this.product.beProducted();
		this.product.beSelled();
	}
}
