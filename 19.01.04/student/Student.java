
public class Student {

	String name = "";
	int ban = 0;
	int no = 0;
	int kor = 0;
	int eng = 0;
	int math = 0;
	
	
	
	Student(){
		
	}
	
	Student(String name, int ban ,int no ,int kor ,int eng ,int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	int getTotal(int kor, int eng, int math){
		int getTotal = 0;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		getTotal = kor + eng + math;
		
		return getTotal;
	}
	
	double getAverage(int kor,int eng,int math) {
		double getAverage = 0.0;
		int total = kor + eng + math;
		getAverage = total / 3.0;
		getAverage = (int)(getAverage * 1000 + 0.5) / 1000.0;
		
		return getAverage;
	}
	
	void Print() {
		int total = getTotal(kor, eng, math);
		double average = getAverage(kor, eng, math);
		System.out.println("실행결과");
		System.out.println("이름 : " + name + " / 반 : " + ban + " / 번호 : " + no);
		System.out.println("국어 : " + kor + " / 영어 : " + eng + " / 수학 : " + math);
		System.out.println("총점: " + total);
		System.out.println("총점: " + average);
	}
	
	
}
