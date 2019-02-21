package Private;
import java.util.Scanner;

public class TimeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t = new Time();
		int hour = 0;
		int minute = 0;
		int sencond = 0;
		
		t.setHour(18);
		hour = t.getHour();
		
		
		t.setMinute(44);
		minute = t.getMinute();
		
		t.setSencond(12);
		sencond = t.getSencond();
		
		System.out.println("┌────────┐");
		
		System.out.println("│" + hour + ":" + minute + ":" + sencond + "│");
		
		System.out.println("└────────┘");

		
//		t.setHour(25);
//		System.out.println(hour);
//		t.setHour(-25);
//		System.out.println(hour);
		
		
	}

}
