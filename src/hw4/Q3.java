package hw4;

public class Q3 {
	public static void main(String[] args) {
	int sum=0;
		String[] s={"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		for(int i=0;i<s.length;i++)
		{
		char[] cha=s[i].toCharArray();
		for(int j=0;j<cha.length;j++) {
			if(cha[j]=='a' || cha[j]=='e' || cha[j]=='i' || cha[j]=='o' || cha[j]=='u')
			{sum+=1;}
				
				
		}
		}
		System.out.print(sum);
		
		
		
		
	}

}
