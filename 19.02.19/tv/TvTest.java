package tv;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv tv = new Tv();
		
		tv.channelUp();
		
		System.out.println(tv.channel);
		System.out.println("===========================");
		CaptionTv cTv = new CaptionTv();
		
		cTv.channelUp();
		cTv.channelUp();
		
		System.out.println(cTv.channel);
		
		cTv.caption();
		System.out.println("===========================");
		
		Tv tvObj = new CaptionTv();
		
		tvObj.channelUp();
		tvObj.channelUp();
		tvObj.channelUp();
		
		System.out.println(tvObj.channel);
		
		System.out.println("===========================");
		
//		CaptionTv cTv2 = new Tv();
//		tvObj.caption();
		
//		Tv smartTv = new SmartTv();
	
	}

}
