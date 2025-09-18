package hw1;

public class HW0911 {
	public static void main(String[] args){
        System.out.println("第一題\n12+6="+(6+12)); 		
        System.out.println("12*6="+(6*12)); 
        System.out.println("\n第二題\n200顆蛋是"+(200/12)+"打及"+(200%12)+"顆"); 
       
        int day=256559/(60*60*24);
        int secLeft1=256559%(60*60*24);
        int hr=secLeft1/(60*60);
        int secLeft2=secLeft1%(60*60);
        int min=secLeft2/60;
        int secLeft3=secLeft2%60;
//        System.out.println(secLeft1);
//        System.out.println(secLeft2);
//        System.out.println(secLeft3);
        System.out.println("\n第三題\n256559秒是"+day+"天"+hr+"小時"+min+"分"+secLeft3+"秒");
        final double PI=3.1415;
        double perimeter=5*2*PI;
        double area=5*5*PI;
        System.out.printf("\n第四題\n半徑為5的圓型其周長為%.4f",perimeter);
        System.out.printf("\n半徑為5的圓型其周長為%.4f",area);
        double interest=Math.pow(1.02,10);
        double moneyTotal=1500000*interest;
        System.out.printf("\n\n第五題\n10年後會有%.4f元",moneyTotal);
        System.out.println("\n\n第六題\n"+(5+5));
//        整數(int)5+5=10
        System.out.println(5+'5');
//        根據ASCII碼表,char 'a'轉換成十進位整數＝53,5+53=58
        System.out.println(5+"5");
//        左邊的5為型別int,右邊的5是字串印上去
	}

}
