package Test;

public class NullTest {

	static String testStr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		기본값
//		int, char, long, double, boolean
		
		int num = 0;
		char ch = ' ';
		boolean flag = false;
		double d = 0.0;
		
//		의미있는 값을 넣어야 오류가 아니다.  <-> 의미있는 값을 넣지않으면 오류가 맞다.
//		null
		System.out.println(num);
		System.out.println(ch);
		System.out.println(flag);
		System.out.println(d);
		
		String str = "";
		String str2 = null;
		
		str.toString();
		str2 = "sdff";
		str2.toString();
		
		System.out.println(str);
		System.out.println(str2);
		
		System.out.println("내가만든 인스턴스 변수야: " + testStr.toString());
	}

}
