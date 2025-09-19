package hw3;
import java.util.Random;
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args)
	{
		System.out.println("開始猜數字吧");
		int x =(int)(Math.random()*10);
		Scanner sc2=new Scanner(System.in);
		while(true)
		{
			int guess=sc2.nextInt();
			if(guess != x)
			   {
				System.out.println("猜錯囉");
			   }
			else
			   {
				System.out.println("猜對囉，答案是" + x);
				break;
			   }
		}
	}
	
}
