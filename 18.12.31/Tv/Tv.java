
public class Tv {

//		tv 속성 : 색상, 전원, 채널
//	  	기능 : 전원 켜기끄기, 볼륨 높이기 낮추기, 
	
//		속성 - 변수, 필드, 상태
		String color;
		boolean power;
		int channel;
		
//		기능	- 메서드, 함수, 행위
		void power() {
			power = !power;
		}
		
		void channelUp(){
			channel++;
		}
		
		void channelDown(){
			channel--;
		}
	}


