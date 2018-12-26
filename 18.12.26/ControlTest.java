import java.util.Scanner;

public class ControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int man = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("방문횟수를 입력해주세요");
		man = scan.nextInt();

		if (man == 0) {
			System.out.println("처음 오셧군요. 방문해 주셔서 감사합니다");
//			System.out.println("방문횟수는 " + (man + 1) + "회 입니다.");
		}


		if (man >= 1) {
			System.out.println("다시 방문해 주셔서 감사합니다");
//			System.out.println("방문횟수는 " + (man + 1) + "회 입니다.");
		}

		System.out.println("방문횟수는 " + (man + 1) + "회 입니다.");
		
	}

}
