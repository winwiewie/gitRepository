
public class CaptionTv extends Tv {

	boolean caption = false;

	CaptionTv() {

	}

	void displayCaption(String text) {
		if(caption == true) {
			System.out.println(text);
		}
	}
	void tvInfo() {		//오버라이딩 한거
		System.out.println("자막 TV");
		System.out.println("전원 상태 : " + power);
		System.out.println("채널 값 : " + channel);
		System.out.println("음소거상태 :" + caption);
	}
}
