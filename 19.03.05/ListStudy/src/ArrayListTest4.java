import java.util.ArrayList;

public class ArrayListTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<TeamPerson> teamPersonList = new ArrayList<TeamPerson>();
//		ArrayList<TeamPerson> teamPersonList = new ArrayList();

		TeamPerson tp = new TeamPerson(1, "장훈일", 30);
		TeamPerson tp2 = new TeamPerson(2, "김충현", 25);

		teamPersonList.add(tp);
		teamPersonList.add(tp2);

		for (int i = 0; i < teamPersonList.size(); i++) {

			teamPersonList.get(i).printInfo();
			System.out.println();
		}

//		강사님이 짠 나이 배열
		TeamPerson teamTeamPerson = null;
		int tempAge = 0;
		
		for (int i = 0; i < teamPersonList.size(); i++) {
			teamTeamPerson = teamPersonList.get(i);
			tempAge = teamTeamPerson.getAge();
			teamPersonList.get(i).setAge(tempAge + 1);
		}
		
		for (int i = 0; i < teamPersonList.size(); i++) {

			teamPersonList.get(i).printInfo();
			System.out.println();
		}

	}

}
