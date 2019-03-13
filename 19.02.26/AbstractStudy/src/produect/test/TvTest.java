package produect.test;

public class TvTest {

	public static void main(String[] args) {
		
		MuteTv muteTv = new MuteTv();
		
		muteTv.power();
		
		muteTv.channelUp();
		muteTv.channelUp();
		muteTv.channelUp();
		
//		muteTv.power();
		
		muteTv.volumeUp();
		muteTv.volumeUp();
		muteTv.volumeUp();
		muteTv.volumeDown();
		
		muteTv.mute();
		

		System.out.println(muteTv);
		
		
		
	}

}
