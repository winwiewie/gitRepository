
public class SnackBox {
	
	
	static String snackName=" 컨테이너";
	static int snackCount=0;
	
	static void snackCount(Snack snack) {//과자가 만들어질때 카운트가 올라감
		if(snackCount==0){
			snackName= snack.name+snackName;
		}
		snackCount+=1;
		System.out.println(snack.name+"가 한개 입고되었습니다.");
		
	}
	
	
	
	static void namePrint() {//입고되어있는 과자 이름 출력
		System.out.println("현재 "+snackName+"에"+snackCount+ "개 있습니다.");
	}

}
