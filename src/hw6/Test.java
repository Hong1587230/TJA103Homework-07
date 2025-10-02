package hw6;

public class Test {
	
	
	public static void main(String[] args) {
		
    Pen a=new Pencil("123",100);
	Pen b=new InkBrush("456",100);
	a.write();
	System.out.println(a.getprice());
	b.write();
	System.out.println(b.getprice());
	

	}
}
