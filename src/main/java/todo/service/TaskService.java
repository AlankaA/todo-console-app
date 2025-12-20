package todo.service;

import todo.model.Task;
import java.util.ArrayList;

public class TaskService {
    ArrayList<Task> listTasks = new ArrayList<>();

    public void addTask() {
        System.out.println("Task added.");
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
