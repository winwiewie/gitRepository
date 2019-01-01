
public class Time {

//	1. 시, 분, 초는 모두 0보다 크거나 같아야한다.
//	2. 시의 범위는 0~23, 분과 초의 범위는 0~59이다.

	int hour = 0;
	int minute = 0;
	double second = 0;

	int getHour() {
		return hour;
	}

	void setHour(int h) {
		if (h < 0 || h > 23) {
			return;
		}
		hour = h;
	}

	int getMinute() {
		return minute;
	}

	void setMinute(int m) {
		if (m < 0 || m > 59) {
			return;
		}
		minute = m;
	}

	double getSecond() {
		return second;
	}

	void setSecond(double s) {
		if (s < 0.0 || s > 59.99) {
			return;
		}
		second = s;
	}
}
