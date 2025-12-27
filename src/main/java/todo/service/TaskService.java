package todo.service;

import todo.model.Task;
import java.util.ArrayList;

public class TaskService {
    private ArrayList<Task> listTasks = new ArrayList<>();

    private int nextId = 0;

    public void addTask(String name, String description) {
        nextId += 1;
        listTasks.add(new Task(nextId, name, description));
    }

    public void deleteTask() {
        System.out.println("Task deleted.");
    }

    public void updateTask() {
        System.out.println("update task");
    }

    public void getListTask() {
        System.out.println("get list task");
    }

    public void markTaskDone() {
        System.out.println("mark task done");

    }
}
