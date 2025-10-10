package hw777;

import java.util.Scanner;

public class CalTest{
	public static void main(String[] args) {
	System.out.print("請輸入x:");
	Scanner sc1=new Scanner(System.in);
	int x=sc1.nextInt();
	System.out.print("請輸入y:");
	Scanner sc2=new Scanner(System.in);
	int y=sc2.nextInt();
	
	try {
		Calculator a=new Calculator();
		System.out.print(a.powerXY(x,y));
	}catch(CalException e) {
		e.printStackTrace();
	}
	sc1.close();
	sc2.close();
	
	
}
}