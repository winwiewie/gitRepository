
public class MoonGravityEx {

//	달에 사람들이 이주했을 때  몸무게는 얼마일까?
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int weight = 0;
		
//		달에서의 중력은 지구보다 1/6
//		자신의 몸무게를 구하는 공식 weight/6
		double moonMyWeight = 0;
		
		weight = 67;
	
		moonMyWeight = weight / (double)6.0;
		moonMyWeight = (int)(moonMyWeight * 1000) / 1000.0;		
		
		//ctrl + f ->현재파일에서  이름 찾기
		//ctrl + h ->전체파일에서 이름찾기
		
		
		System.out.println("나의 몸무게는 " + weight);
		System.out.println("달에서의 나의 몸무게 : " + moonMyWeight);
	}

}
