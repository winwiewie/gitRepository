package root.parent.child;

import root.parent.Parent1;

public class Child3 extends Parent1 {
	public String name = "";
	
	public Child3() {
		super(); //-> 묵시적으로 다있음
		
	}

	public String nameView() {
		
		return name;
	}
}
