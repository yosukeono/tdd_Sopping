import junit.framework.TestCase;


public class GoodTest extends TestCase {

	public GoodTest(String arg0) {
		super(arg0);
	}

	public void testGoodPrice() {
		Goods ice = new Goods(100);
		
		assertEquals(100, ice.getPrice());
	}
	
	public void testGetTaxIncludedPrice() {
		Goods ice = new Goods(100);
		assertEquals(105,ice.getTaxIncludedPrice());
		
		Goods handkerchief = new Goods(500);
		assertEquals(525, handkerchief.getTaxIncludedPrice());
	}
}
