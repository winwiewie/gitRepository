package exam.test1;

class Parent {
	int x = 100;

	Parent() {
		this(200);
	}

	Parent(int x) {
		this.x = x;
	}

	int getX() {
		return x;
	}
}