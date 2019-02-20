package tv;

public class UnderstandTest {

	public static void main(String[] args) {
//		Tv를 통해서 스마트 tv를 다루시오
		
		Tv tv = new Tv();
	

		
		tv.power();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		
		System.out.println("전원상태 : " + tv.power);
		System.out.println("채널상태 : " + tv.channel);
		System.out.println();
		
		Tv tv1 = new CaptionTv();
		
		tv1.power = true;
		tv1.power();
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelDown();
		
		
		System.out.println("전원상태 : " + tv1.power);
		System.out.println("채널상태 : " + tv1.channel);
		System.out.println();
		
		SmartTv smartTv = new SmartTv();
		
		smartTv.intentSwitch();
		
		System.out.println("스마트 Tv전원 : " + smartTv.intentSwitch);
		
		Tv tv2 = new SmartTv();
//		tv2.intentSwitch();
	}
}
