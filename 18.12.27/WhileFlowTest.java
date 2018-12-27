import java.util.Scanner;

import javafx.scene.text.Text;

public class WhileFlowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "";
		int num = 0;
		int count = 0;
		count = 4;

		Scanner scan = new Scanner(System.in);

		while (count >= 0) {

			System.out.println(count + " - I can do it");

			count--;
		}

		while (num < 3) { 				// 조건식이 트루일때 실행
			System.out.println("내용을 입력해주세요");
			System.out.println("만약 종료를 원한다면 -999를 입력해 주세요");
			str = scan.nextLine();

			System.out.println(str);
			System.out.println();

			num++;
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
