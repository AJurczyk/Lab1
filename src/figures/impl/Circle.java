package figures.impl;

import figures.FigureAbstract;

import static java.lang.Math.PI;

public class Circle extends FigureAbstract {

    private final double radius;

    public Circle(double r) {
        radius = r;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public void print() {
        System.out.println("Circle radius = " + radius);
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.000");
        System.out.println("Area: " + df.format(calculateArea()));
        System.out.println("Perimeter: " + df.format(calculatePerimeter()));
    }
}
