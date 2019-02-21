package Private;
	
public class Time {
	
	private int hour;
	private int minute;
	private	int secnond;
	
	public void setHour(int hour) {
		if(hour < 1 || hour > 24) {
			return;
		}
		this.hour = hour;	
	}
	
	public int getHour() {
		return hour;
	}
	
//  0~59 분
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59 ) {	//0보다 작고 59보다 크면 리턴
			return;
		}
		this.minute = minute;	
	}
	
	public int getMinute() {
		return minute;
	}
	
	
//	0~59 초
	public void setSencond(int secnond) {
		if(secnond < 0  || secnond > 59) {
			return;
		}
		this.secnond = secnond;	
	}
	
	public int getSencond() {
		return secnond;
	}
}
