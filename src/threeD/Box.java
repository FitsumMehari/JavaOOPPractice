/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threeD;

/**
 *
 * @author hp
 */
public class Box extends ThreeDObject {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    public double volume() {
        return length * width * height;
    }
}
