package tv;

public class SmartTv extends Tv{
	
	String voice = "";
	
	boolean intentSwitch = false;
	
	SmartTv(){
		
	}
	void intentSwitch(){
		intentSwitch = !intentSwitch;
	}
	
}
