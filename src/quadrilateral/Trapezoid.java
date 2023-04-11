package quadrilateral;

class Trapezoid extends Quadrilateral {
    public Trapezoid(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override 
    public double getArea() {
        // Calculate area of trapezoid
        return ((getP2Y() - getP1Y())/2) * ((getP3X() - getP2X()) + (getP4X() - getP1X()));
    }
}