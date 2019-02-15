package root.parent.child;

public class Child2 {
	String name = "";
	int age = 0;
	
	public Child2() {
//		this(매개변수);
		this("자식2");
	}
	
	public Child2(String name){
		this.name = name;
	}
	
	public Child2(String name, int age){
//		this.name = name;
		this(name);
		this.age = age;
	}
	
	public String nameView() {
		
		return name;
	}
}
