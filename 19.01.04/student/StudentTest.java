
public class StudentTest {

	public static void main(String[] args) {
		
		
		String name = "";
		int ban = 0;
		int no = 0;
		int kor = 0;
		int eng = 0;
		int math = 0;
		int getTotal = 0;
		double getAverage = 0;
		
		name = "김충현";
		ban = 7;
		no = 7;
		kor = 60;
		eng = 75;
		math = 64;
		
		Student student = new Student(name,ban,no,kor,eng,math);
		student.getTotal(kor, eng, math);
		student.getAverage(kor, eng, math);
		student.Print();
	}
}
