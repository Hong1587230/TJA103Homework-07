package hw6;

public class InkBrush extends Pen {
	
	public void write() {
		System.out.println("沾墨汁再寫");
	}
	
	public double getprice() {
		return super.getprice()*0.9;
    }
	
	public InkBrush(String brand,double price) {
		super(brand,price);
	}

}
