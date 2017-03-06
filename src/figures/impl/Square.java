package figures.impl;

import figures.FigureAbstract;

public class Square extends FigureAbstract {

    private final double a;

    public Square(double side) {
        a = side;
    }

    @Override
    public double calculateArea() {
        return a * a;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * a;
    }

    public void print() {
        System.out.println("Square side is: " + a);
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.000");
        System.out.println("Area: " + df.format(calculateArea()));
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
