package string1;

public class ExceptionEx2Test {
	public static void main(String[] args) {

//		null 포인트 예외를 발생시키는데 
//		문제가 발생하였습니다. 
//		예외메시지 : 뒤에 메시지를 출력하시오
//		ex) 문제가 발생하였습니다. /zero

		System.out.println(1);
		System.out.println(2);

		String[] newArr = new String[2];

		newArr = null;

		try {
			System.out.println(3);
			System.out.println(newArr.getClass());
			System.out.println(3);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ex:) 문제가 발생했습니다.");
			System.out.println("예외메시지 : " + e.getMessage());
		}
		System.out.println("종료");

	}
}
