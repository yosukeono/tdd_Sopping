
public class Goods {

	private int unitPrice = 0;
	
	public Goods(int unitPrice) {
		// TODO Auto-generated constructor stub
		this.unitPrice = unitPrice;
	}

	public int getPrice() {
		return this.unitPrice;
	}

	public Object getTaxIncludedPrice() {
		// TODO Auto-generated method stub
		return (int)(this.unitPrice * 1.05);
	}

}
