package hw5;
import java.util.Random;

public class Q2 {
	
	public static void randAvg() {
		int[]ranarray=new int[10];
		int sum=0;
		for(int i=0;i<ranarray.length;i++) {
			ranarray[i]=(int)(Math.random()*101);
			sum+=ranarray[i];
		}
		System.out.println("本次亂數結果：");
		for(int a:ranarray) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println((double)sum/10.0);
	}
	
	public static void main(String[] args) {
		randAvg();
	}
	}


