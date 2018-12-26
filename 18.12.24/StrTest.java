
public class StrTest {
	public static void main(String[] args) {

//		문자형 <-오로지 한글자만 존재할수 있음,문자형의 초기값은 공백(" ") 이다.
		char ch = ' ';  

//		문자열	초기값 <- 어떤다른내용들과 합쳐져도 영향을 주지 않아야 한다.	
//		문자열의 특징		
//		문자열  + any type - > 문자열 + 문자열 -> 문자열		
//		any type + 문자열   - > 문자열 + 문자열 -> 문자열		

		String string = "";
		
		string = 7 + " " + true;
		
		System.out.println(string);
		
		String str = "";
		String name = "";

		
		str = "Ja" + "va";  //Java
		name = str + 8.0;	
		
		System.out.println("str : " + str);
		System.out.println("name : " + name);
		
	}
}
