import static java.lang.Math.PI;
public class Circle extends Figure
    implements Print{
    private final double radius;

    @Override
    double calculateArea() {
        return PI*radius*radius;
    }

    @Override
    double calculatePerimeter() {
        return 2* PI*radius;
    }

    @Override
    public void print() {
        System.out.println("Circle radius = " + radius);
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.000");
        System.out.println("Area: " + df.format(calculateArea()));
        System.out.println("Perimeter: " + df.format(calculatePerimeter()));
    }

    Circle(double r){
           radius=r;
    }
}
