package string;

public class StringTest4 {

   public static void main(String[] args) {
      
	   String originStr = "dog, cat, bird, bear";

	   //split을 사용하지 않고 dog, cat,bird,bear의 단어를 변수에 저장및 출력하시오	
	   
//	   String dog1 = originStr.substring(0,3);
//	   String cat1 = originStr.substring(5,8);
//	   String bird1 = originStr.substring(10,14);
//	   String bear1 = originStr.substring(16,20);
//	   
//
//	   System.out.println(dog1);
//	   System.out.println(cat1);
//	   System.out.println(bird1);
//	   System.out.println(bear1);
	   
	   
	   // 2019/02/22

//	   String datechange = "/";
	   String date =  "2019/02/22";
	   
//	   String date2 = date.replace('/', '-');
	   String date1 = date.substring(0,4);
	   
	   String datechange = date.substring(4,5);
	   datechange  = "-";
	   
	   String date2 = date.substring(5);
	   
//	   date.indexOf(5);
//	   date.indexOf(8);
	   
//	     훈일씨 split로 한거
	   System.out.println(date1 + datechange + date2);
	   
	   String[] arr = date.split("/", 3);
	   System.out.println(arr[0] + "년" + arr[1] + "월" + arr[2]);

	   
	   
	   

	
   }

}