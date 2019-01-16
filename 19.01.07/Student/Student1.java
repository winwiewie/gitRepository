
public class Student1 {

	String name = "";
	int ban = 0;
	int number = 0;
	int kor = 0;
	int eng = 0;
	int math = 0;
	
	int getTotal(){
		int getTotal = kor + eng + math;
		
		System.out.println("국어 : " + kor + " 영어 : " + eng + " 수학 : " + math);
		return getTotal;
	}
	
	double getAverage() {
		double getAverage = 0;
		int sum = kor + eng + math;
		getAverage = sum / 3.0;
		
		getAverage = Math.round(getAverage * 100 )/ 100.0;
//		getAverage = (int)(getAverage * 100 + 0.5) / 100.0;
		
		
		return getAverage;
	}
	

}
