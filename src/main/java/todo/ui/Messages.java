package todo.ui;

public class Messages {
    // MENU
    private static final String MENU = """
            \n========MENU========
            Chose one from the option:
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
    // ERROR
    private static final String EMPTY_IS_NOT_ALLOWED = "Empty input is not allowed.";
    public static final String ENTER_INTEGER = "Invalid input. Enter an integer.";
    public static final String MENU_INVALID_OPTION = "Invalid option. Choose 1-6.";

    public String menu() {
        return MENU;
    }

    public String exit() {
        return EXIT;
    }

    public String finished() {
        return FINISHED;
    }

    public String EmptyIsNotAllowed() {
        return EMPTY_IS_NOT_ALLOWED;
    }

    public String enterInteger() {
        return ENTER_INTEGER;
    }

    public String menuInvalidOption() {
        return MENU_INVALID_OPTION;
    }
}
