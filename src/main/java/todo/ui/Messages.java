package todo.ui;

public class Messages {
    // MENU
    private static final String MENU = """
            \n========MENU========
            Choose one from the options:
            1. Add task
            2. Delete task
            3. Update task
            4. Get list of tasks
            5. Mark task done
            6. Exit
            =====================""";
    // INFO
    private static final String EXIT = "Exiting...";
    private static final String FINISHED = "Program is finished!";
    private static final String TASK_ADDED = "Task added!";
    private static final String TASK_DELETED = "Task deleted!";
    private static final String TASK_UPDATED = "Task updated!";
    private static final String TASK_DONE = "Task Done:";
    private static final String EMPTY_TASK_LIST = "The task list is empty!";
    private static final String NOTHING_TO_DELETE = "The task list is empty. Nothing to delete.";
    private static final String TASK_LIST = "The task list:\n";
    // PROMPT
    private static final String TASK_NAME = "Enter task name:";
    private static final String TASK_DESCRIPTION = "Enter task description:";
    private static final String TASK_ID = "Enter task id:";
    // ERROR
    private static final String EMPTY_IS_NOT_ALLOWED = "Empty input is not allowed.";
    private static final String ENTER_INTEGER = "Invalid input. Enter an integer.";
    private static final String NEGATIVE_INPUT_ALLOWED = "Negative inputs are not allowed.";
    private static final String MENU_INVALID_OPTION = "Invalid option. Choose 1-6.";
    private static final String UNEXPECTED_MENU_OPTION = "Unexpected menu option:";


    //MENU
    public String menu() {
        return MENU;
    }

    // INFO
    public String exit() {
        return EXIT;
    }

    public String finished() {
        return FINISHED;
    }

    public String taskAdded() {
        return TASK_ADDED;
    }

    public String taskDeleted() {
        return TASK_DELETED;
    }

    public String taskUpdated() {
        return TASK_UPDATED;
    }

    public String taskDone() {
        return TASK_DONE;
    }

    public String nothingToDelete() {
        return NOTHING_TO_DELETE;
    }

    public String emptyTaskList() {
        return EMPTY_TASK_LIST;
    }

    public String taskList() {
        return TASK_LIST;
    }

    // PROMPT
    public String taskName() {
        return TASK_NAME;
    }

    public String taskDescription() {
        return TASK_DESCRIPTION;
    }
    public String taskId() {
        return TASK_ID;
    }

    // ERROR
    public String emptyIsNotAllowed() {
        return EMPTY_IS_NOT_ALLOWED;
    }

    public String enterInteger() {
        return ENTER_INTEGER;
    }

    public String negativeInputAllowed() {
        return NEGATIVE_INPUT_ALLOWED;
    }

    public String menuInvalidOption() {
        return MENU_INVALID_OPTION;
    }

    public String unexpectedMenuOption() {
        return UNEXPECTED_MENU_OPTION;
    }
}
