package Class7;

public class Square {
	    public Point center;
	    public double side;

	    public double area() {
	        double area = side * side;
	        return area;
	    }

	    public double perimeter() {
	        double perimeter = side * 4;
	        return perimeter;
	    }

	    public Square() {
	        center = new Point();
	        setSide(0.0);
	    }

	    public Square(Point t, double r) {
	        center = new Point(t);
	        setSide(r);
	    }

	    public Square(Square t) {
	        center = new Point(t.center);
	        setSide(t.side);
	    }

	    public void setSide(double r) {
	        if (r >= 0.0) {
	            side = r;
	        }
	    }

	    public boolean contains(Point t) {
	        if (center.distance(t) <= side) {
	            return true;
	        }
	        return false;
	    }

	    public boolean contains(Square t) {
	        if (center.distance(t.center) + t.side <= side) {
	            return true;
	        }
	        return false;
	    }

	    public boolean contains(Circle t) {
	        if (center.distance(t.center) + t.radius <= side) {
	            return true;
	        }
	        return false;
	    }

	    public String toString() {
	        return "Circle. Side:" + side + " " + center.toString();
	    }
	}
