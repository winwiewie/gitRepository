import java.util.HashMap;
import java.util.Map;



public class TeamPersonDb {
	
	private  Map<String ,TeamPerson> teamPersontMap = new HashMap();
	

	public  void setStudent (TeamPerson teamPerson) {
		String name = teamPerson.getName();
		teamPersontMap.put(name, teamPerson);
	}
	

	public  TeamPerson getTeamPerson(String name) {
		TeamPerson teamPerson = null;
		
		teamPerson = teamPersontMap.get(name);
		
		return teamPerson;
		
	}


	
	
}
