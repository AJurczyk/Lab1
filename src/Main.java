import figures.exceptions.FigureException;
import figures.impl.Circle;
import figures.impl.Square;
import figures.impl.Triangle;
import printing.InOutHandler;

public class Main{
    public static void main(String args[]){
        InOutHandler inOutHandler = new InOutHandler();

        boolean exit = false;
        while (!exit) {
            inOutHandler.printMenu();
            switch (inOutHandler.askForChoice()) {
                case 1:
                    inOutHandler.printSimpleMessage("Triangle");
                    double sideA = inOutHandler.askForParameter("side A");
                    double sideB = inOutHandler.askForParameter("side B");
                    double sideC = inOutHandler.askForParameter("side C");
                    Triangle triangle = null;
                    try {
                        triangle = new Triangle(sideA, sideB, sideC);
                    } catch (FigureException e) {
                        inOutHandler.printSimpleMessage(e.getMessage());
                        continue;
                    }
                    inOutHandler.printFigureInfo(triangle);
                    break;
                case 2:
                    inOutHandler.printSimpleMessage("Square");
                    double side = inOutHandler.askForParameter("side");
                    Square square = new Square(side);
                    inOutHandler.printFigureInfo(square);
                    break;
                case 3:
                    inOutHandler.printSimpleMessage("Circle");
                    double radius = inOutHandler.askForParameter("radius");
                    Circle circle = new Circle(radius);
                    inOutHandler.printFigureInfo(circle);
                    break;
                case 4:
                    exit = inOutHandler.askForExit();
                    break;
                default:
                    inOutHandler.printSimpleMessage("Incorrect choice. Please try again.");
                    break;
            }
        }
    }
}
