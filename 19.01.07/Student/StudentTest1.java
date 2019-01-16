
public class StudentTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 student1 = new Student1();
		
		
		student1.name = "김충현";
		student1.ban = 1;
		student1.number = 7;
		student1.kor = 60;
		student1.eng = 70;
		student1.math = 64;
		
		System.out.println(student1.getTotal());
		System.out.println(student1.getAverage());
	}

}
