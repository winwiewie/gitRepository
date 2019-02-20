package ObjectTest;

public class InstanceTest {

	public static void main(String[] args) {
		
		Apple a= null;
		Apple b= null;
		Apple c= null;
		Apple d= new Apple();
		
		a = b = c = d;
		
		System.out.println(a.name);
		System.out.println(b.name);
		System.out.println(c.name);
		System.out.println(d.name);
		
		b.name = "세상에서 가장 맛있는 사과";
		System.out.println(a.name);
		System.out.println(b.name);
		System.out.println(c.name);
		System.out.println(d.name);
	}
}
