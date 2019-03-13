package tg.com.test;

import java.util.Scanner;

import tg.com.db.StudentDb;
import tg.com.student.Student;

public class StudentScoreViewMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String groupName = "";
		String name = "";
		int goodLifeScore = 0;
		int spachWriteScore = 0;
		int PhysicalScore = 0;
		int totalScore = 0;
		String lifeRecord = "";

		Student student = null;

		groupName = "성실반";
		name = "이명선";
		goodLifeScore = 70;
		spachWriteScore = 100;
		PhysicalScore = 50;
		lifeRecord = "성실하고 착하나 몸이약함";

		totalScore = goodLifeScore + spachWriteScore + PhysicalScore;
		student = new Student(groupName, name, goodLifeScore, spachWriteScore, PhysicalScore, totalScore, lifeRecord);

//		System.out.println(student);
//		student.showStudentInfo();

		StudentDb.setStudent(student);

		groupName = "성실반";
		name = "박기성";
		goodLifeScore = 80;
		spachWriteScore = 100;
		PhysicalScore = 30;
		lifeRecord = "게임을 많이 좋아하 학업 성적 우수함 단지 몸이약함";

		totalScore = goodLifeScore + spachWriteScore + PhysicalScore;
		student = new Student(groupName, name, goodLifeScore, spachWriteScore, PhysicalScore, totalScore, lifeRecord);

		StudentDb.setStudent(student);

		groupName = "성실반";
		name = "윤승환";
		goodLifeScore = 100;
		spachWriteScore = 80;
		PhysicalScore = 100;
		lifeRecord = "성실하고 착하며 건강함 단 칭찬에 약함";

		totalScore = goodLifeScore + spachWriteScore + PhysicalScore;
		student = new Student(groupName, name, goodLifeScore, spachWriteScore, PhysicalScore, totalScore, lifeRecord);

		StudentDb.setStudent(student);

		Scanner scan = new Scanner(System.in);
		String searchName = "";

		while (true) {

			System.out.println("검색하실 학생의 이름을 입력하세요");
			System.out.println("빠져나가고 싶으면 exit를 입력해주세요");
			searchName = scan.nextLine();
	
//			System.out.println(student.getName().equals(searchName));
			
							
				student = StudentDb.getStudent(searchName); 
			
			if (searchName.equals("exit")) { //이게 문제 현재 3번째인 윤승환만 저장되어서 윤승환만 트루임

				System.out.println("종료");
				break;

			} else if (student != null) {
				
				student.showStudentInfo();
				
			} else {

				System.out.println("잘못입력하셧습니다.");
				System.out.println("다시 입력해주세요");
				
			}

			System.out.println();
		}

//		student = StudentDb.getStudent("이명선");
//		student.showStudentInfo();

	}
}
