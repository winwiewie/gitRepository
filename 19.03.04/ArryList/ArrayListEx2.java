import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ArrayList list = new ArrayList();
		
		list.add(5);
		list.add("글자도 당연 되지");
		list.add(new Object());
	
		
		System.out.println(list.get(0));
		System.out.println(list.get(3));
		
		System.out.println("=============================");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
