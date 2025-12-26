package todo.ui;

public class InputValidator {


    public boolean validateMenuInput(int inputInt) {
        return inputInt >= 1 && inputInt <= 6;
    }

    public boolean validateNotEmpty(String taskName) {
        taskName = taskName.trim();
        return taskName.isEmpty();
    }
}
