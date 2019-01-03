
public class Calc {

	int multiply(int firstNum, int secondNum) {
		int result = firstNum * secondNum;

		return result;
	}

	double divide(double firstNum, double secondNum) {
		double result =  firstNum /  secondNum;
		result = (int)(result * 100) / 100.0;
		
		return result;
	}

	int remove(int firstNum, int secondNum) {
		int result = firstNum - secondNum;

		return result;
	}
}
