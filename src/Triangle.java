import static java.lang.Math.sqrt;
public class Triangle extends Figure
    implements Print{
    double a,b,c;

    static boolean checkIfTriangleIsValid(double A, double B, double C){
        if(A+B>C && A+C>B && B+C>A)
            return true;
        else
            return false;
    }
    static double heron(double A, double B, double C){
        double area =(A+B+C)*(A+B-C)*(A-B+C)*(-A+B+C);
        area = sqrt(area)/4;
        return area;
    }
    @Override
    double calculateArea() {
        return heron(a,b,c);
    }
    @Override
    double calculatePerimeter() {
        double perimeter = a+b+c;
        return perimeter;
    }
    @Override
    public void print() {
        System.out.println("Triangle sides length: " +a +", " +b +", " +c);
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.000");
        System.out.println("Area: "+df.format(calculateArea()));
        System.out.println("Perimeter: "+ calculatePerimeter());
    }
    public Triangle(double x,double y,double z) {
        a=x; b=y; c=z;
    }
}
