package hw5;
import java.util.Scanner;

public class Q1 {
	public static void starSquare(int width,int height)
	{
//		System.out.println("請輸入寬：");
//		Scanner sc=new Scanner(System.in);
//		width=sc.nextInt();
//		
//		System.out.println("請輸入高：");
//		Scanner sc1=new Scanner(System.in);
//		height=sc1.nextInt();
		
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				System.out.print("＊");
			}
			System.out.println();
		}
		
			
	}
	public static void main(String[] args) {
		System.out.println("請輸入寬：");
		Scanner sc=new Scanner(System.in);
		int width=sc.nextInt();
		
		System.out.println("請輸入高：");
		Scanner sc1=new Scanner(System.in);
		int height=sc1.nextInt();
		
		starSquare( width,height);
		
	}

}
