package hw5;

public class Q5 {
	
	public static String getAuthCode() {
		String list="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String ran="";
		for(int i=0;i<8;i++) {
		   int index=(int)(Math.random()*list.length());
		   ran+=list.charAt(index);
		}
		return ran;
	}
	
	public static void main(String[] args) {
		System.out.println("本次隨機產生驗證碼為：");
		System.out.println(getAuthCode());
		
		
	}

}
