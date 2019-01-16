
public class MuteTv extends Tv {

//	볼륨
//	음소거
	
//	음소거 조작버튼
//	만약음소거 기능을 켰다면
//	볼륨을 0
	
//	만약 음소거 기능이 꺼져있다면
//	볼윰을 이전 상태로 되돌린다.
	
	int volume = 0;
	boolean mute = false;
	int previousvolume = 0; 	//이전 볼륨값을 저장
	
	MuteTv(){
		
	}
	
	void mute() {
		mute = !mute; 		// 상태 변경
		
		if(mute == true) {
			previousvolume = volume;
			volume = 0;
		}else{
			volume = previousvolume;
		}			
	}
	
	void print() {
		System.out.println(this.volume);
		System.out.println(this.mute);
		System.out.println(this.volume);
	}
	
	
}
