package points;

import points.figure.Point3D;

public class PointsTest {

	public static void main(String[] args) {
		
 		Point3D p3 = new Point3D(1,2,3);
		String point= p3.getLocation();
		
		
		System.out.println(point);
	}
}
