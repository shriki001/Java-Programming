package Class6;//מישור

public class Point {//הגדרה כללית

	int x,y;

	public Point() {//הגדרת ערכים במחלקה
		x = 1;
		y = 2;
	}
	
	public Point(int a, int b) {//השמה
		set(a,b);
	}
	
	
	public void printPoint() {//הדפסת מרחק
		System.out.println("Point. x:" + x + " y:" + y);
	}

	public  void set(int a, int b) {//הצבת ערכים
		x=a;
		y=b;
	}

	public double distance(Point r) {//חישוב מרחק
		int dx = x - r.x;
		int dy = y - r.y;
		return Math.sqrt(dx*dx + dy*dy);
	}
	
}
