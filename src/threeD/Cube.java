package threeD;

class Cube extends ThreeDObject {

    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double surfaceArea() {
        return 6 * side * side;
    }

    public double volume() {
        return side * side * side;
    }
}
