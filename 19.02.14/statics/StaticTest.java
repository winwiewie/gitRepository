package statics;

public class StaticTest {
	
	static int width = 2000;
	static int height = 120;
	
	String name ="";
	
	static int max(int num, int num2) {
		
		
		return num > num2 ? num : num2;
	}
	
	int test(int num, int num2, int num3) {
		name = "홍길동";
		System.out.println(name);
		
		return num > num2 ? num : num2;
	}
}
