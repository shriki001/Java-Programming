package Class7;

public class Point {

	 private int x;
	    private int y;

	    public Point() {
	        setX(0);
	        setY(0);
	    }

	    public Point(int a, int b) {
	        setX(a);
	        setY(b);
	    }

	    public Point(Point t) {
	        setX(t.x);
	        setY(t.y);
	    }

	    public void setX(int a) {
	        if (a >= 0) {
	            x = a;
	        }
	    }

	    public void setY(int b) {
	        if (b >= 0) {
	            y = b;
	        }
	    }

	    public int getX() {
	        return x;
	    }

	    public int getY() {
	        return y;
	    }

	    public double distance(Point t) {
	        int dx = x - t.x;
	        int dy = y - t.y;
	        return Math.sqrt(dx * dx + dy * dy);
	    }

	    public String toString() {
	        return "Point. x:" + x + " y:" + y;
	    }
	}