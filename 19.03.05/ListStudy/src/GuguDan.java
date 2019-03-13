import java.util.ArrayList;

public class GuguDan {
	private int firstNo = 0;
	private int middleNo = 0;
	private int resultNo = 0;
	
	public GuguDan() {

	}

	public GuguDan(int firstNo, int middleNo) {
		this.firstNo = firstNo;
		this.middleNo = middleNo;
		this.resultNo = firstNo * middleNo;
	}
	
	public void printInfo() {
		resultNo = firstNo * middleNo;
		System.out.println(firstNo + " × " + middleNo + " = " + resultNo);
	}

	public int getFirstNo() {
		return firstNo;
	}

	public void setFirstNo(int firstNo) {
		this.firstNo = firstNo;
	}

	public int getMiddleNo() {
		return middleNo;
	}

	public void setMiddleNo(int middleNo) {
		this.middleNo = middleNo;
	}

	public int getResultNo() {
		return resultNo;
	}

	public void setResultNo(int resultNo) {
		this.resultNo = resultNo;
	}

	public ArrayList<GuguDan> setNumDan(int danNum) {
		int danVal = 0;
		ArrayList<GuguDan> gugudanList = new ArrayList();
		GuguDan ggd = null;
		
		for (int i = 0; i < 9; i++) {
			danVal = i + 1;
			ggd = new GuguDan(danNum, danVal);
			gugudanList.add(ggd);
		}
		
		return gugudanList;
	}

	@Override
	public String toString() {
		return "Gugudan [firstNo=" + firstNo + ", middleNo=" + middleNo + ", resultNo=" + resultNo + "]";
	}

}
