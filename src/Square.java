public class Square extends Figure
    implements Print{
    private final double a;

    @Override
    double calculateArea() {
        return a*a;
    }
    @Override
    double calculatePerimeter() {
        return 4*a;
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
