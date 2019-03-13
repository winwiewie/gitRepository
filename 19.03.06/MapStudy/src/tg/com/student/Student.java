package tg.com.student;

public class Student {

//	학생
//	반이름	
//	바른생활
//	말하기,글쓰기
//	체육
//	총점
//	생활기록부

	private String groupName = "";
	private String name = "";
	private int goodLifeScore = 0;
	private int spachWriteScore = 0;
	private int PhysicalScore = 0;
	private int totalScore = 0;
	private String lifeRecord = "";

	public Student() {
		super();
	}

	public Student(String groupName, String name, int goodLifeScore, int spachWriteScore, int physicalScore,
			int totalScore, String lifeRecord) {
		super();
		this.groupName = groupName;
		this.name = name;
		this.goodLifeScore = goodLifeScore;
		this.spachWriteScore = spachWriteScore;
		this.PhysicalScore = physicalScore;
		this.totalScore = totalScore;
		this.lifeRecord = lifeRecord;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGoodLifeScore() {
		return goodLifeScore;
	}

	public void setGoodLifeScore(int goodLifeScore) {
		this.goodLifeScore = goodLifeScore;
	}

	public int getSpachWriteScore() {
		return spachWriteScore;
	}

	public void setSpachWriteScore(int spachWriteScore) {
		this.spachWriteScore = spachWriteScore;
	}

	public int getPhysicalScore() {
		return PhysicalScore;
	}

	public void setPhysicalScore(int physicalScore) {
		PhysicalScore = physicalScore;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public String getLifeRecord() {
		return lifeRecord;
	}

	public void setLifeRecord(String lifeRecord) {
		this.lifeRecord = lifeRecord;
	}

	public void showStudentInfo() {
		System.out.println("반이름:\t\t" + groupName);
		System.out.println("이름:\t\t" + name);
		System.out.println("바른생활:\t\t" + goodLifeScore);
		System.out.println("말하기.쓰기:\t" + spachWriteScore);
		System.out.println("체육:\t\t" + PhysicalScore);
		System.out.println("총점:\t\t" + totalScore);
		System.out.println("생활기록부:\t" + lifeRecord);
	}

	@Override
	public String toString() {
		return "Student [groupName=" + groupName + ", name=" + name + ", goodLifeScore=" + goodLifeScore
				+ ", spachWriteScore=" + spachWriteScore + ", PhysicalScore=" + PhysicalScore + ", totalScore="
				+ totalScore + ", lifeRecord=" + lifeRecord + "]";
	}

}
