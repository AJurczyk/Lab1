package figures.impl;

import figures.FigureAbstract;
import figures.exceptions.FigureException;

import static java.lang.Math.sqrt;

public class Triangle extends FigureAbstract {

    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) throws FigureException {
        this.a = a;
        this.b = b;
        this.c = c;
        if(!isValid()){
            throw new FigureException("Invalid triangle dimensions!");
        }
    }

    private boolean isValid() {
        return a + b > c && a + c > b && b + c > a;
    }

    private double heron(double A, double B, double C) {
        double area = (A + B + C) * (A + B - C) * (A - B + C) * (-A + B + C);
        area = sqrt(area) / 4;
        return area;
    }

    @Override
    public double calculateArea() {
        return heron(a, b, c);
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public void print() {
        System.out.println("Triangle sides length: " + a + ", " + b + ", " + c);
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.000");
        System.out.println("Area: " + df.format(calculateArea()));
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
