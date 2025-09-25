package hw3;
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args)
	{
		System.out.println("開始猜數字吧(請輸入0~100的數字)");
		int x =(int)(Math.random()*101);
		try (Scanner sc2 = new Scanner(System.in)) {
			while(true)
			{
				int guess=sc2.nextInt();
				if(guess > x)
				   {
					System.out.println("太大囉");
				   }
				else if(guess<x)
				   {
					System.out.println("太小囉");
				   }
				else
				   {
					System.out.println("很棒棒哦，答案是" + x);
					break;
				   }
			}
		}
	}
	
}
