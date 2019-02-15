package root.test;

import root.parent.child.Child1;

public class StudyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String resultstr = "";
		Child1 child1 = new Child1();
		Child1 child2 = new Child1();
		Child1 child3 = new Child1("내가 만든 자식");
		
		resultstr = child1.nameView();
		
		System.out.println(resultstr);
		System.out.println(child2.nameView());
		
		resultstr = child3.nameView();
		
		System.out.println(resultstr);
	}
}
