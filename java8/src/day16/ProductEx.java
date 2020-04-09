package day16;

public class ProductEx {

	public static void main(String[] args) {
		Product<Tv, String> p1 = new Product<Tv, String>();
		p1.setKind(new Tv());
		p1.setMode("»ï¼ºÆÄºê");
		System.out.println(p1.getMode());
		
		Product<Car, Integer> p2 = new Product<Car, Integer>();
		p2.setKind(new Car());
		p2.setMode(new Integer(30));
		
	}

}
