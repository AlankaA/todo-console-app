package todo.ui;

import java.util.Scanner;

public class InputReader {
    private final Scanner input;

    public InputReader(Scanner input) {
        this.input = input;
    }

    public String readInput() {
        return input.nextLine();
    }
}
