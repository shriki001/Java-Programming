package Class6;

public class class6 {

	public static void main(String[] args) {
		//3נקודות במרחב
		Point3 p = new Point3(5, 10, 12);
		Point3 q = new Point3(1, 2, 3);
		double ans = p.distance(q);
		System.out.println(ans);
		
		//2נקודות במישור
		Point a = new Point(0, 0);
		Point b = new Point(12, 16);
		double answer = a.distance(b);
		System.out.println(answer);

	}

}
