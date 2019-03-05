import java.util.ArrayList;

public class ArrayListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();

		TeamPerson tp = new TeamPerson();
		TeamPerson tp2 = new TeamPerson();

		tp.setTeamNo(1);
		tp.setName("조혜선");
		tp.setAge(24);

		tp2.setTeamNo(2);
		tp2.setName("장훈일");
		tp2.setAge(39);

		ArrayList tpCopy = new ArrayList();
		ArrayList tpCopy2 = new ArrayList();



		tpCopy.add(tp);
		tpCopy2.add(tp2);
		
//		tpCopy.add(tp.getTeamNo());
//		tpCopy.add(tp.getName());
//		tpCopy.add(tp.getAge());
//
//		tpCopy2.add(tp2.getTeamNo());
//		tpCopy2.add(tp2.getName());
//		tpCopy2.add(tp2.getAge());

		System.out.println(tp);
		System.out.println(tp2);

		System.out.println(tpCopy);
		System.out.println(tpCopy2);


//		tpCopy.remove(0);
//		tpCopy2.remove(0);
//
//		tpCopy.remove(tpCopy.size() - 1);
//		tpCopy2.remove(tpCopy2.size() - 1);
//		
//		tpCopy.add(0, tp.getTeamNo() + 1);
//		tpCopy2.add(0, tp2.getTeamNo() + 1);
//
//		tpCopy.add(tpCopy.size(), tp.getAge() - 1);
//		tpCopy2.add(tpCopy2.size(), tp2.getAge() - 1);

		

		System.out.println();
		System.out.println(tpCopy);
		System.out.println(tpCopy2);
		
		System.out.println(tp);
		System.out.println(tp2);

	}

}
