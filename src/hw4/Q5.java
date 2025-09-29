package hw4;
import java.util.Scanner;

public class Q5 {
	public static void main(String[] args)
	{
		int year,month,date;
		int day[]= { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		System.out.print("請輸入西元年份：");
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		if(isLeapYear(year))
			day[1]=29;
		System.out.print("請輸入月份：");
		while(true)
		{
		Scanner sc1=new Scanner(System.in);
		month=sc1.nextInt();
		if(month<=12 && month>=1)
			break;
		else
			System.out.print("請重新輸入");
		
		}
			
			
		
		System.out.print("請輸入日期：");
		while(true)
		{
			Scanner sc2=new Scanner(System.in);
			date=sc2.nextInt();
			if(date<=day[month-1] && date>=1 )
			break;
			else
				System.out.print("請重新輸入");
		}
		int dayofyear=0;
		for(int i=0;i<month-1;i++)
		{dayofyear+=day[i];}
		dayofyear+=date;
		System.out.print("是第"+dayofyear+"天");
		
		
	}
	public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}
}
