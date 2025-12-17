package todo.ui;

public class Messages {
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
    private static final String EXIT = "Exiting...";
    private static final String FINISHED = "Program is finished!";
    private static final String EMPTY_IS_NOT_ALLOWED = "Empty input is not allowed.";

    public void printMenu() {
        System.out.println(MENU);
    }

    public void printExit() {
        System.out.println(EXIT);
    }

    public void printFinished() {
        System.out.println(FINISHED);
    }

    public void printEmptyIsNotAllowed() {
        System.out.println(EMPTY_IS_NOT_ALLOWED);
    }
}
