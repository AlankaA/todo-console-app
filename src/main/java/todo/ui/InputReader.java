package todo.ui;

import java.util.Scanner;

public class InputReader {
    Scanner input = new Scanner(System.in);

    public String readInput(String prompt) {
        System.out.println(prompt);
        return input.nextLine();
    }
}
