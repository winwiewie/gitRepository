public class Test2 {

	public static void main(String[] args) {

//		맵을 이용한다
//		팀원 정보를 입력한다.
//		원하는 팀원의 정보를 출력한다.
//		이름으로 teamPerson에 관련된 정보를 출력한다
		int teamNo = 0;
		String name = "";
		int age = 0;
		
//		HashMap<String, TeamPerson> nameMap = new HashMap();
		TeamPerson  teamPerson = null;
		TeamPersonDb teamPersonDb = new TeamPersonDb();
		teamNo = 1;
		name = "조혜선";
		age = 23;		
		
		teamPerson = new TeamPerson(teamNo, name, age);
		
		teamPersonDb.setStudent(teamPerson);
		teamPerson.printInfo();
	
		
		
	}

}
