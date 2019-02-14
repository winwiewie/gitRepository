package finals;

public class Finalmain {

	public static void main(String[] args) {
			
		FinalTest FinalTest = new FinalTest();
		int maxSize = 0;
		maxSize = FinalTest.getMaxSize();

		System.out.println("이건 FinalTest에서 불러온거야: "+ maxSize);
		
		ChildClass childClass = new ChildClass();
		maxSize = childClass.getMaxSize();
		
		System.out.println("이건 ChildClass를 호출한거야: " + maxSize);
		
		
		
	}	
}
