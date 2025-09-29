package hw4;
import java.util.Scanner;

public class Q2 {

	
	public static void main(String[] args)
	{
		System.out.print("請輸入字串");
		try (Scanner sc3 = new Scanner(System.in)) {
			String s=sc3.nextLine();
			    for (int i = s.length() - 1; i >= 0; i--) {
			  System.out.print(s.charAt(i));
			    }
		}
	             }
}
