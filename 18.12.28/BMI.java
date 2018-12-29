import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
//		bmi = 체중/(키*키 )

//		bmi < 18.5 			저체중
//		bmi(18.5 - 24.9) 	정상		
//		bmi(25   - 29.9)	과체중
//		bmi < (30)			비만		
		
		double kg = 0;
		double m = 0;
		double bmi = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("키 와 몸무게를 입력하시오");
		System.out.println("키의 단위는 m 단위입니다. 191.5->1.915");
		System.out.print("키를 입력해주세요 : ");
		m = scan.nextDouble();
		
		System.out.print("체중을  입력해주세요 : ");
		kg = scan.nextDouble();
		System.out.println();
		
		bmi = kg / (m * m);
		bmi = (int)(bmi * 100) / 100.0;
		
		if (bmi <= 18.5) {
			System.out.println("당신은 저체중 입니다.");
			
		}else if(bmi <= 24.9) {
			System.out.println("당신은 정상 입니다.");
			
		}else if(bmi <= 29.9) {
			System.out.println("당신은 과체중 입니다.");
		
		}else {
			System.out.println("당신은 비만 입니다.");
			
		}
		System.out.println("BMI : " + bmi );
	}
}
