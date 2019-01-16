package tg.exam;

import tg.exam.three.GugudanService;

public class ExamMainThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// 3번 문제
		GugudanService gugudan = new GugudanService();

		// 원하는 단 하나 출력
		gugudan.showGugudan(2);

		System.out.println();

//		 사용자가 지정한 2개의 숫자 사이 만큼의 구구단 출력
		gugudan.showGugudan(3, 5);

	}

}
