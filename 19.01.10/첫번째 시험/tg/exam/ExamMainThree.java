package tg.exam;

import tg.exam.three.GugudanService;

public class ExamMainThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// 3번 문제
		GugudanService gugudan = new GugudanService();

		gugudan.showGugudan(2);
		System.out.println();
		gugudan.showGugudan(3, 5);

		System.out.println();
		
		gugudan.showGugudan(-20);
		System.out.println();
		gugudan.showGugudan(5, 3);
		
		System.out.println();
		
		gugudan.showGugudan(0);
		System.out.println();
		gugudan.showGugudan(3, 3);
	}

}
