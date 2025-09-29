package hw4;

public class Q1 {
	
	public static void main(String[] args) {
	int[] hw1={29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
	
	int total=0;
	for(int i=0;i<hw1.length;i++)
	{
		total+=hw1[i];
	}
	int ave=(total/10);
	System.out.println(ave);
	for(int i=0;i<hw1.length;i++) {
		
		if(hw1[i]>ave)
		{
			System.out.print(hw1[i]+" ");
		}
		
	}
	

}
}