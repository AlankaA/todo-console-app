package todo.model;

import java.util.Scanner;

public class Task {
    private final int id;
    private String name;
    private String description;
    private boolean done;

    public Task(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.done = false;
    }


    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isDone() {
        return this.done;
    }


    public void setName(Scanner input, String taskName) {
        while (true) {
            System.out.println("Enter the task name:");
            taskName = input.nextLine();
            taskName = taskName.trim();
            if (taskName.isEmpty()) {
                System.out.println("[ERROR] Task name cannot be empty!");
                continue;
            }
            this.name = taskName;
            break;
        }
    }
}
