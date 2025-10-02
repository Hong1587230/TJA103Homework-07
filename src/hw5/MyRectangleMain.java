package hw5;

    class MyRectangle {
	
	double width;
	double depth;
	
	public  void setWidth(double width) {
		this.width=width;
	}
	
	public  void setDepth(double depth) {
		this.depth=depth;
	}
	
	public void getArea() {
		System.out.print(width*depth);
	}
	
	public MyRectangle() {
	}
	public MyRectangle(double width, double depth) {
		this.width=width;
		this.depth=depth;
    }
}

    public class MyRectangleMain {
    	
    	public static void main(String[] args) {
    		MyRectangle a = new MyRectangle(10,20);
    		a.getArea();
    		
    	}
	

}
