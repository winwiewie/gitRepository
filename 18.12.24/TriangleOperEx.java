
public class TriangleOperEx {

	public static void main(String[] args) {
		
//		삼항연산자
//		표현식
//		(조건식) ?  식1  :   식2
//				  true :  false			
//		ex : 변수 = (조건식) ? 식1 : 식2; 
//  	? -> 맞으면 	
		
		int x = 0;
		int y = 0;
		
		x = 10;
		y = -10;
		
		int absX = (x >= 0) ?  x : -x;	// -> absX = x;
		int absY = (y >= 0) ?  y : -y;	// -> absY = -y; 
//					-10		-y('-' * '-10')
		
		System.out.println("x= 10일때 , x의 절대값은 " + absX);
		System.out.println("y= -10일때 , y의 절대값은 " + absY);
		
	}
}
