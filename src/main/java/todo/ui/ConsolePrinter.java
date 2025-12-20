package todo.ui;

public class ConsolePrinter {

    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[91m";
    private static final String GREEN = "\u001B[32m";
    private static final String BLUE = "\u001B[34m";


    public void printError(String message) {
        System.out.println(RED + "[ERROR] " + message + RESET);
    }

    public void printInfo(String message) {
        System.out.println(BLUE + "[INFO] " + message + RESET);
    }

    public void print(String message) {
        System.out.println(GREEN + message + RESET);
    }
}
