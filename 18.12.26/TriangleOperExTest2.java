import java.util.Scanner;

public class TriangleOperExTest2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		num = 9999;
		
		String str = " ";
		
		System.out.println("숫자를 입력하시오");
		num = scan.nextInt();
		
		str = (num >= 1 ) ?  "양수" : (num <= -1) ? "음수" : "0" ;
		
		System.out.println(str);
				
	}
}
