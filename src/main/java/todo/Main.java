package todo;

import todo.ui.Messages;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Messages message = new Messages();


        int choise = 0;
        while (choise != 6) {
            message.printMenu();
            choise = input.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    message.printExit();
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected menu option: " + choise);
            }
            message.printFinished();
        }
    }
}