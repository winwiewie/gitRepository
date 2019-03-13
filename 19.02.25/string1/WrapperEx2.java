
package string1;

public class WrapperEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String originDate = "2019년02월25일";
	
		
		int yearLoc = originDate.indexOf('년');
		int monthLoc = originDate.indexOf('월');
		int dayLoc = originDate.indexOf('일');
		int regexLength = 1;
		
		int year = Integer.parseInt(originDate.substring(0, yearLoc));
		int month = Integer.parseInt(originDate.substring(yearLoc+regexLength, monthLoc));
		int day = Integer.parseInt(originDate.substring(monthLoc+regexLength, dayLoc));
		
		System.out.println((year+1) + "년" + month + "월" + day + "일");
		System.out.println(year + "년" + month + "월" + (day+3)  + "일");
		System.out.println((year+1) + "년" + (month+3) + "월" + (day-9) + "일");
		
	}

}
