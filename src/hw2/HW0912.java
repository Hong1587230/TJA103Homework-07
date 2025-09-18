package hw2;

public class HW0912 
{
	
	//課後練習
	public static void main(String[] args){
		int i,j;
	
		for (i = 1; i <= 9; i++) {
			j=1;
			while(j<=9)
			{System.out.print(i + "*" + j + "=" + i * j + "\t");
			j++;
			}
			System.out.println();
	}
		System.out.println();
		
		for(i=1;i<=9;i++)
		{
			j=1;
			do {System.out.print(i + "*" + j + "=" + i * j + "\t");
			j++;}while(j<=9);
			System.out.println();
		}
		
		System.out.println();
		
		i=1;
		while(i<=9)
		{
			
			j=1;
			do {System.out.print(i + "*" + j + "=" + i * j + "\t");
			j++;}while(j<=9);
			i++;
			System.out.println();
		}
		
	
	
		System.out.println();
		
	int sum=0;
	int a;
	for(a=1;a<=1000;a++)
	{
		if(a%2==0)
		{
			sum+=a;
		}
	
	}
	System.out.println(sum);
	
	System.out.println();
	
	int c;
	int sum2=1;
	for(c=1;c<=10;c++)
	{
		sum2*=c;
	}
	System.out.println(sum2);
	
	System.out.println();
	
	int d=1;
	int sum3=1;
	while(d<=10)
	{
		sum3*=d;
		d++;
	}
	System.out.println(sum3);
	
	System.out.println();
	
	for(int e=1;e<=10;e++)
	{
		System.out.println(e*e+" ");
	}
	
	System.out.println();
	
	int total=0;
	for(int f=1;f<=49;f++)
	{
		if(f/10!=4&&f%10!=4)
		{
			System.out.print(f+" ");
			total++;
		}
	}
	
	System.out.println();
	
	System.out.println("不含4的數字共有"+total+"個");
	
	System.out.println();
	
	int g,h;
	for(g=10;g>=1;g--)
	{
		for(h=1;h<=g;h++)
		{
			System.out.print(h);	
		}
		System.out.println();
	}
	
	System.out.println();
	
	for(char k ='A';k<='F';k++)
	{
		for(char l='A';l<=k;l++)
		{
		System.out.print(k);
		}
		System.out.println();
	}
	
	
	
}
}