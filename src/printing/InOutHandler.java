package printing;


import figures.FigureAbstract;

import java.util.Scanner;

public class InOutHandler {

    private final Scanner scanner = new Scanner(System.in);

    public InOutHandler() {
    }

    public void printMenu() {
        System.out.println("\n---Calculator menu---");
        System.out.println("Figures:");
        System.out.println("1 - Triangle");
        System.out.println("2 - Square");
        System.out.println("3 - Circle");
        System.out.println("4 - Exit");
    }

    public void printFigureInfo(FigureAbstract figureAbstract) {
        figureAbstract.print();
    }

    public boolean askForExit() {
        System.out.println("Are you sure you want to exit? y/n");
        char exit_choice = scanner.next().charAt(0);
        return (exit_choice == 'y' || exit_choice == 'Y');
    }

    public int askForChoice() {
        System.out.println("Input choice:");
        return scanner.nextInt();
    }

    public double askForParameter(String paramName) {
        System.out.println("Give me " + paramName + ": ");
        return scanner.nextDouble();
    }

    public void printSimpleMessage(String message){
        System.out.println(message);
    }
}
