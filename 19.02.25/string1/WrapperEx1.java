package string1;

import java.util.Scanner;

public class WrapperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
//		String str = "100";
//		System.out.println("1. 숫자를 입력해주세요");
//		str  = scan.nextLine();
		
//		문자열 글자가 들어가 잇지 않아야 한다.
//		오로지 문자열 안에는 숫자가 들어가 있어야 유용하낟
		Integer numObj = new Integer(0);
		int n = 0;
		
		
//		int num = new Integer("100").intValue();		
//		System.out.println("2. 숫자를 입력해주세요");
//		num  = scan.nextInt();
//		int num2 = Integer.parseInt(str);
//		
//		Integer num3 =  Integer.valueOf("100");
//		
//
//		System.out.println("num = " + num);
//		System.out.println("num2= " + num2);
//		System.out.println("num3= " + num3);
		
		String num1 = "300";
		String num2 = "200";
		
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);

		System.out.println(num3 + num4);
		System.out.println();
		
//--------------------------------------------------------------		
		
		String date = "2019년02월25일"; 
		String[] dateArr = date.split("년", 2);	
	
		int num5 = Integer.parseInt(dateArr[0]);
		num5 = num5 + 1;


		System.out.println( num5 + "년"  + dateArr[1]);
		System.out.println();

//--------------------------------------------------------------
		
		String year = date.substring(0,4);
		String month = date.substring(5,7);
		String day = date.substring(8,10);
		
		String monthDay = date.substring(5);
		
		System.out.println(monthDay);
		
		int yearInt = Integer.parseInt(year);
		int monthInt = Integer.parseInt(month);
		int dayInt = Integer.parseInt(day);

		
		month = "0"+ monthInt ;
		
		String chaangDate = yearInt + "년"	+ month + "월" + dayInt + "일";
		System.out.println(chaangDate);
		
		
	}

}
