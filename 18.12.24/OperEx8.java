
public class OperEx8 {

	public static void main(String[] args) {
		
//		소수점 내림처리
		double pi = 0.0;		
		double shortPi = 0.0;
		double roundPi = 0.0;
		
//		소수점 3째자리까지 처리할때		
		pi = 3.141592;
		shortPi = (int)(pi * 1000) / 1000.0;
		
		System.out.println("소수점 3째자리 까지 표현 : " + shortPi);
		
//		반올림		
		roundPi =(int)(pi * 1000 + 0.5);	//3141.592 + 0.5 -> 3142
		roundPi = roundPi / 1000.0;			//3142 / 1000.0 -> 3.142
		
		System.out.println("소수점 3째자리 에서 반올림 : " + roundPi);
		
		
	}
}
