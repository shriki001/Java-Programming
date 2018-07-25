package Class7;

public class MyClass {
    public static void main(String[] args) {
        Point p = new Point();
        //Point q = new Point(8, 8);
        Circle a = new Circle(p, 5.0);
        Circle f = new Circle(p, 9.0);
        Square b = new Square(p, 9.0);
        Square t = new Square(p, 7.0);
        double s = a.area();
        System.out.println("Circle area: " + s);
        double h = a.perimeter();
        System.out.println("Circle perimeter: " + h);
        double s2 = b.area();
        System.out.println("Square area: " + s2);
        double h2 = b.perimeter();
        System.out.println("Square perimeter: " + h2);
        boolean c = b.contains(p);
        System.out.println("Square contains Point?: " + c);
        boolean e = b.contains(t);
        System.out.println("Square contains Square T?: " + e);
        boolean d = b.contains(f);
        System.out.println("Square contains Circle?: " + d);
        boolean g = a.contains(b);
        System.out.println("Circle contains Square?: " + g);
    }
}
