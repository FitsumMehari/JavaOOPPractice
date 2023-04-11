package quadrilateral;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 5);
        Point p3 = new Point(5, 5);
        Point p4 = new Point(5, 0);

        Quadrilateral q = new Quadrilateral(p1, p2, p3, p4);
        Trapezoid t = new Trapezoid(p1, p2, p3, p4);
        Parallelogram p = new Parallelogram(p1, p2, p3, p4);
        Rectangle r = new Rectangle(p1, p2, p3, p4);
        Square s = new Square(p1, p2, p3, p4);

        System.out.println("Area of Trapezoid: " + t.getArea());
        System.out.println("Area of Parallelogram: " + p.getArea());
        System.out.println("Area of Rectangle: " + r.getArea());
        System.out.println("Area of Square: " + s.getArea());
    }
}