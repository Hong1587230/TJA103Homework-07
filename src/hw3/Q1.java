package hw3;
import java.util.Scanner;

public class Q1 {
	
	public static void main(String[] args) {
	System.out.println("請輸入三個整數:");
	Scanner sc1=new Scanner(System.in);
	int num1=sc1.nextInt();
	Scanner sc2=new Scanner(System.in);
	int num2=sc2.nextInt();
	Scanner sc3=new Scanner(System.in);
	int num3=sc3.nextInt();

	if	(num1+num2<=num3 || num2+num3<=num1 || num1+num3<=num2 || num1<=0 ||num2<=0 ||num3<=0)
	    {System.out.print("不是三角形");}
	else if(num1 == num2 && num1==num3 && num2==num3)
		{System.out.print("正三角形");}
	else if(num1 == num2 || num1==num3 || num2==num3)
	    {System.out.print("等腰三角形");}
	else
	    {System.out.print("其他三角形");}
	
	
	}

}
