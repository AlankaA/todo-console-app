package todo.ui;

public class InputValidator {


    public boolean isValidMenuChoice(int inputInt) {
        return inputInt >= 1 && inputInt <= 6;
    }

    public boolean isNotEmpty(String input) {
        return input != null && !input.trim().isEmpty();
    }

    public boolean isNotNegative(int inputInt) {
        return inputInt >= 0;
    }
}
