package todo.ui;

public class InputValidator {

    public boolean validateMenuInput(int inputInt) {
        if (inputInt <= 0 || inputInt > 6) {
            return false;
        }
        return true;
    }
}
