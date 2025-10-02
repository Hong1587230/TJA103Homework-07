package hw6;

    public abstract class Pen {
	private String brand;
	private double price;
	
	public Pen() {
		
	}
	
    public Pen(String brand,double price) {
    	this.brand=brand;
    	this.price=price;
		
	}
    
    public String getbrand() {
    	return brand;
    }
    
    public double getprice() {
    	return price;
    }
    
    public void setbrand(String brand) {
    	this.brand=brand;
    }
    
    public void setprice(int price) {
    	this.price=price;
    }
    
    public abstract void write();
	
}
