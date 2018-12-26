import javafx.geometry.Side;

public class SwitchFlowEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 0;
//		랜덤 - > 임의의 값		
		score = (int)(Math.random() * 10) + 1; //+1을하면 1~10 ,안하면 0~9

		System.out.println(Math.random());
//		Math.random()의 값		
//		0.9999999999999 ~ 0.000000000000어쩌구
//		1 >  ? >= 0.0
		
//		0.999999 * 10 -> 9.99999 - > 9 +
//		0.0 * 10 -> 0
	}

}
