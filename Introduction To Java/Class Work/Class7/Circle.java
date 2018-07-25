package Class7;

public class Circle {
	    public Point center;
	    public double radius;

	    public double area() {
	        double area = Math.PI * (radius *radius);
	        return area;
	    }

	    public double perimeter() {
	        double perimeter = Math.PI * (2 * radius);
	        return perimeter;
	    }

	    public Circle() {
	         center = new Point();
	         setRadius(0);
	    }

	    public Circle(Point t, double r) {
	         center = new Point(t);
	         setRadius(r);
	    }

	    public Circle(Circle t) {
	        center = new Point(t.center);
	        setRadius(t.radius);
	    }

	    public void setRadius(double r) {
	        if (r >= 0) {
	            radius = r;
	        }
	    }

	    public boolean contains(Point t) {
	        if ( center.distance(t) <=  radius) {
	            return true;
	        }
	        return false;
	    }

	    public boolean contains(Circle t) {
	        if ( center.distance(t.center) + t.radius <=  radius) {
	            return true;
	        }
	        return false;
	    }

	    public boolean contains(Square t) {
	        if ( center.distance(t.center) + t.side <=  radius) {
	            return true;
	        }
	        return false;
	    }

	    public String toString() {
	        return "Circle. radius:" +  radius + " " +  center.toString();
	    }
	}

