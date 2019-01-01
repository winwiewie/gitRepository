
public class Tvtest2 {

//	기능 -실행
	public static void main(String[] args) {
		
//		tv3개를 만든다
//		하나는 나에게
//		하나는 짝에게
//		하나는 다른 동기생중 한분
//
//		내 텔레비전은 채널이 1이다
//		전원이 켜져있다.
//		 짝 텔레비전은 채널이 좋아하는 숫자로 설정한다.
//		전원은 켜져잇다
//		다른 동기 텔레비전은 임의의 숫자로 설정한다.
//		전원 꺼저 잇다.
		
		Tv myTv = new Tv();
		Tv partnerTv = new Tv();
		Tv partnerTv2 = new Tv();
		
		myTv.channel = 7;
		myTv.power = true;
		
		partnerTv.channel = 1;
		partnerTv.power = true;
		
		partnerTv2.channel = 5;
	
		
		System.out.println("myTv 전원 " + myTv.power);
		System.out.println("myTv 채널 " + myTv.channel);
		System.out.println();

		System.out.println("partnerTv 전원 " + partnerTv.power);
		System.out.println("partnerTv 채널 " + partnerTv.channel);
		System.out.println();
		
		
		System.out.println("박강인의 전원 " + partnerTv2.power);
		System.out.println("박강인씨의 " + partnerTv2.channel);				
		
	}
}
