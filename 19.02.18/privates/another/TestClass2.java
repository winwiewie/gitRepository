package privates.another;

import privates.test.ProtectedTest;

public class TestClass2 extends ProtectedTest {
	
	void testMetho() {
		super.num = 100;
		System.out.println(super.num);
		System.out.println(super.className);
	}
}
