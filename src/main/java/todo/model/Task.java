package todo.model;

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


    public void setName(String taskName) {
        this.name = taskName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void markDone() {
        this.done = true;
    }

    public void unmarkDone() {
        this.done = false;
    }
}
