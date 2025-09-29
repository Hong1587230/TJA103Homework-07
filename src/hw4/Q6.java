package hw4;
import java.util.Arrays;

public class Q6 {
	public static void main(String[] args)
	{
		int test[][]={{10,35,40,100,90,85,75,70},{37,75,77,89,64,75,70,95},{100,70,79,90,75,70,79,90},{77,95,70,89,60,75,85,89},{98,70,89,90,75,90,89,90},{90,80,100,75,50,20,99,75}};
		int score[][]={{10,35,40,100,90,85,75,70},{37,75,77,89,64,75,70,95},{100,70,79,90,75,70,79,90},{77,95,70,89,60,75,85,89},{98,70,89,90,75,90,89,90},{90,80,100,75,50,20,99,75}};
		Arrays.sort(test[0]);
		int max1=test[0][7];
		Arrays.sort(test[1]);
		int max2=test[1][7];
		Arrays.sort(test[2]);
		int max3=test[2][7];
		Arrays.sort(test[3]);
		int max4=test[3][7];
		Arrays.sort(test[4]);
		int max5=test[4][7];
		Arrays.sort(test[5]);
		int max6=test[5][7];
		int count[]=new int[8];
		for(int i=0;i<6;i++)
			{
			for(int j=0;j<8;j++)
			{
				if(score[i][j]==test[i][7])
					count[j]++;
			}
			
		}
		
		for(int i=0;i<8;i++)
		{
			System.out.println("第"+(i+1)+"位同學得最高分的次數為"+count[i]);
			
		}
		
	}

}
