
package threeD;

class Cone extends ThreeDObject {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double surfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * slantHeight + Math.PI * radius * radius;
    }

    public double volume() {
        return Math.PI * radius * radius * height / 3;
    }
}
