package todo.ui;

public class ConsolePrinter {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[91m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";


    public void printError(String message) {
        System.out.println(RED + "[ERROR] " + message + RESET);
    }

    public void printInfo(String message) {
        System.out.println(BLUE + "[INFO] " + message + RESET);
    }

    public void printPrompt(String message) {
        System.out.println(GREEN + "[PROMPT] " + message + RESET);
    }
}
