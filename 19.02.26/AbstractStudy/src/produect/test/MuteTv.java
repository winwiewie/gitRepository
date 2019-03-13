package produect.test;

public class MuteTv extends Tv {

	@Override
	public void power() {
		// TODO Auto-generated method stub
		
		power = !power;
//		if(power = !power) {
//			System.out.println("현재 전원 Off");
//		}else {
//		   System.out.println("현재 전원 On");
//		}
		
	}

	@Override
	void channelUp() {
		// TODO Auto-generated method stub
		channel++;
//		System.out.println("현재 채널 상태 : " + channel);
	}

	@Override
	void channelDown() {
		// TODO Auto-generated method stub
		channel--;
//		System.out.println("현재 채널 상태 : " + channel);
	}

	@Override
	void volumeUp() {
		// TODO Auto-generated method stub
		volume++;
//		System.out.println("현재 볼륨 상태 : " + volume);
	}

	@Override
	void volumeDown() {
		// TODO Auto-generated method stub
		volume--;
//		System.out.println("현재 볼륨 상태 : " + volume);
	}
	
	void mute() {
		volume = 0;
//		System.out.println("현재 음소거 상태 : " + volume);
	}


	
	
	

}
