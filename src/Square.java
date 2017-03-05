public class Square extends Figure
    implements Print{
    double a;

    @Override
    double calculateArea() {
        double area = a*a;
        return area;
    }
    @Override
    double calculatePerimeter() {
        double perimeter = 4*a;
        return perimeter;
    }
    public Square(double side){
        a=side;
    }
    public void print(){
        System.out.println("Square side is: "+a);
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.000");
        System.out.println("Area: "+df.format(calculateArea()));
        System.out.println("Perimeter: "+ calculatePerimeter());
    }
}
