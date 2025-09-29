package hw4;
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args)
	{

		emp one=new emp(25,2500);
		emp two=new emp(32,800);
		emp three=new emp(8,500);
		emp four=new emp(19,1000);
		emp five=new emp(29,1200);
		emp[]e= {one,two,three,four,five};
		System.out.print("請輸入欲借金額");
		try (Scanner sc = new Scanner(System.in)) {
			int lend=sc.nextInt();	
			int total=0;
			System.out.print("有錢可借的員工編號：");
			for(int i=0;i<e.length;i++)
			{
				if(e[i].money>=lend)
				{
					System.out.print(e[i].no+" ");
					total+=1;
				}
			}
			System.out.print("，共"+total+"人");
		}
		
	}

}

class emp{
	  int no;
	  int money;
//	public int getno()
//	{
//		return no;
//	}
//	public int getmo()
//	{
//		return money;
//	}
	public emp(int no,int money)
	{
		this.no=no;
		this.money=money;
		
	}
}