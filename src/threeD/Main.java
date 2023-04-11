package threeD;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length, width, and height of box: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        Box box = new Box(length, width, height);
        System.out.println("Surface Area of Box: " + box.surfaceArea());
        System.out.println("Volume of Box: " + box.volume());

        System.out.print("Enter side of cube: ");
        double side = scanner.nextDouble();
        Cube cube = new Cube(side);
        System.out.println("Surface Area of Cube: " + cube.surfaceArea());
        System.out.println("Volume of Cube: " + cube.volume());

        System.out.print("Enter radius and height of cylinder: ");
        double radius = scanner.nextDouble();
        height = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("Surface Area of Cylinder: " + cylinder.surfaceArea());
        System.out.println("Volume of Cylinder: " + cylinder.volume());

        System.out.print("Enter radius and height of cone: ");
        radius = scanner.nextDouble();
        height = scanner.nextDouble();
        Cone cone = new Cone(radius, height);
        System.out.println("Surface Area of Cone: " + cone.surfaceArea());
        System.out.println("Volume of Cone: " + cone.volume());

        scanner.close();
    }
}
