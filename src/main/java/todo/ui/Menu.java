package todo.ui;

public class Menu {
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

    public String getMenu(){
        return MENU;
    }
}
