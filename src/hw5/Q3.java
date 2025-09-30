package hw5;

public class Q3 {
	
	public static int maxElement(int[][]ran) {
		int max=ran[0][0];
		for(int i=0;i<ran.length;i++) {
			for(int j=0;j<ran[i].length;j++) {
				if(ran[i][j]>max) {
					max=ran[i][j];
				}
				
			}
			
		}
		return max;
	}
	
	public static double maxElement(double[][]ran) {
		double max=ran[0][0];
		for(int i=0;i<ran.length;i++) {
			for(int j=0;j<ran[i].length;j++) {
				if(ran[i][j]>max) {
					max=ran[i][j];
				}
				
			}
			
		}
		return max;
	}
	public static void main(String[] args) {
		int[][]intarray= {{1,6,3},{9,5,2}};
		System.out.println(maxElement(intarray));
		double[][]douarray= {{1.2,3.5,2.2},{7.4,2.1,8.2}};
		System.out.print(maxElement(douarray));
	}
}
