/**
 * 具体产品
 * @author qiaojy
 *
 */
public class House extends Product{

	@Override
	public void beProducted() {
		System.out.println("生产出房子...");
	}

	@Override
	public void beSelled() {
		System.out.println("把房子卖出去...");
	}

	
}
