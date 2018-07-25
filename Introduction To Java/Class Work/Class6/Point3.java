package Class6;//מרחב

public class Point3 {

	int x, y, z;

	public Point3() {
		x = 1;
		y = 2;
		z = 4;
	}

	public Point3(int a, int b, int c) {
		set(a, b, c);
	}

	public void printPoint() {
		System.out.println("Point. x:" + x + " y:" + y + " z:" + z);
	}

	public void set(int a, int b, int c) {
		x = a;
		y = b;
		z = c;
	}

	public double distance(Point3 r) {
		int dx = x - r.x;
		int dy = y - r.y;
		int dz = z - r.z;
		return Math.sqrt(dx * dx + dy * dy + dz * dz);
	}

}
