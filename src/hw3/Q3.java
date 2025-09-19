package hw3;
import java.util.Random;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Q3 {
	public static int rd(int total)
	{
		return (int)(Math.random()*(total+1));
	}
	public static void main(String[] args)
	{
		System.out.println("阿文...請輸入你討厭哪個數字");
		Scanner sc3=new Scanner(System.in);
		int hate=sc3.nextInt();
		
		int total=0;
		for(int f=1;f<=49;f++)
		{
			if(f/10!= hate &&f%10!=hate)
			{
				total++;
			}
		}
		int[] hatearray=new int[total];
		int i = 0;
		for(int f=1;f<=49;f++)
		{
			if(f/10!= hate &&f%10!=hate)
			{
					hatearray[i]=f;
					i++;
			}
		}
		Set<Integer> hs = new HashSet<>();
		Random ran=new Random();
		int one=rd(total);
		int two=rd(total);
		int three=rd(total);
		int four=rd(total);
		int five=rd(total);
		int six=rd(total);
		
		while(true)
		{
		  one=rd(total);
		  two=rd(total);
		  three=rd(total);
		  four=rd(total);
		  five=rd(total);
		  six=rd(total);
		  hs.add(one);
		  hs.add(two);
		  hs.add(three);
		  hs.add(four);
		  hs.add(five);
		  hs.add(six);
		if(hs.size()==6)
			break;
		}
		System.out.print(hs);
		System.out.println(hatearray[one]+" "+hatearray[two]+" "+hatearray[three]+" "+hatearray[four]+" "+hatearray[five]+" "+hatearray[six]);	
	}

}

