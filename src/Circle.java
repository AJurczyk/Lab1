public class Circle extends Figure
    implements Print{
    private final double radius;

    @Override
    double calculateArea() {
        double area;
        area = Math.PI*radius*radius;
        return area;
    }
    @Override
    double calculatePerimeter() {
        double perimeter;
        perimeter = 2*Math.PI*radius;
        return perimeter;
    }
    @Override
    public void print() {
        System.out.println("Circle radius = "+radius);
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.000");
        System.out.println("Area: "+df.format(calculateArea()));
        System.out.println("Perimeter: "+ df.format(calculatePerimeter()));
    }

    Circle(double r){
           radius=r;
    }
}
