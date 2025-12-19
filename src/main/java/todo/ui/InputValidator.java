package todo.ui;

public class InputValidator {

    public boolean validateMenuInput(int inputInt) {
        if (inputInt <= 0 || inputInt > 6) {
            return false;
        }
        return true;
    }

    public int validateTaskID(String taskID) {
        taskID = taskID.trim();
        int taskIDInt = Integer.parseInt(taskID);
        return taskIDInt;

    }

    public boolean validateTaskName(String taskName) {
        taskName = taskName.trim();
        if (taskName.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean validateDescription(String taskName) {
        return true;
    }
}
