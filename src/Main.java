import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            printMenu();
            System.out.println("Input choice:");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    triangleCalculator();
                    break;
                case 2:
                    squareCalculator();
                    break;
                case 3:
                    circleCalculator();
                    break;
                case 4:
                    exit=ifExitCalculator();
                    break;
                default:
                    System.out.println("Incorrect choice. Please try again.");
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("\n---Calculator menu---");
        System.out.println("Figures:");
        System.out.println("1 - Triangle");
        System.out.println("2 - Square");
        System.out.println("3 - Circle");
        System.out.println("4 - Exit");
    }
    private static void triangleCalculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Triangle");
        System.out.print(" a=");
        double sideA = scanner.nextDouble();
        System.out.print(" b=");
        double sideB = scanner.nextDouble();
        System.out.print(" c=");
        double sideC = scanner.nextDouble();
        //TODO exception here
        if(Triangle.checkIfTriangleIsValid(sideA,sideB,sideC)) {
            Triangle triangle = new Triangle(sideA, sideB, sideC);
            triangle.print();
        }
        else {
            System.out.println("Incorrect dimensions, triangle is not valid.");
        }
    }
    private static void squareCalculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Square");
        System.out.print(" a=");
        //TODO exception here
        double side = scanner.nextDouble(); //exception
        Square square = new Square(side);
        square.print();
    }
    private static void circleCalculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Circle");
        System.out.print("radius= ");
        //TODO exception here
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        circle.print();
    }
    private static boolean ifExitCalculator(){
        System.out.println("Are you sure you want to exit? y/n");
        Scanner scanner = new Scanner(System.in);
        char exit_choice = scanner.next().charAt(0);
        return (exit_choice == 'y' || exit_choice == 'Y');
    }
}
