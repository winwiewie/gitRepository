package root.test;

import root.parent.child.Child2;

public class StudyTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String resultstr = "";
		Child2 child2 = new Child2();
		Child2 child3 = new Child2("내가 만든 자식");
		
		resultstr = child2.nameView();
		
		System.out.println(resultstr);

		
		resultstr = child3.nameView();
		
		System.out.println(resultstr);
	}
}
