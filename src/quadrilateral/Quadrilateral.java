package quadrilateral;

class Quadrilateral {

    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    // Getter methods for X
    public int getP1X() {
        return p1.getX();
    }
    public int getP2X() {
        return p2.getX();
    }
    public int getP3X() {
        return p3.getX();
    }
    public int getP4X() {
        return p4.getX();
    }
    
    // Getters for Y
    public int getP1Y() {
        return p1.getY();
    }
    public int getP2Y() {
        return p2.getY();
    }
    public int getP3Y() {
        return p3.getY();
    }
    public int getP4Y() {
        return p4.getY();
    }

    public double getArea() {
        // Calculate area of parallelogram
        return ((p2.getY() - p1.getY()) * (p4.getX() - p1.getX()));
    }

}
