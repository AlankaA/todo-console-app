package todo.service;

import todo.model.Task;
import java.util.ArrayList;
import java.util.List;

public class TaskService {
    final ArrayList<Task> listTasks;
    private int nextId = 0;

    public TaskService() {
        listTasks = new ArrayList<Task>();
    }

    public void addTask(String name, String description) {
        nextId += 1;
        listTasks.add(new Task(nextId, name, description));
    }

    public void deleteTask(int id) {
        listTasks.remove(id);
    }

    public void updateTask() {

    }

    public List<Task> getListTask(){
        return listTasks;
    }

    public void markTaskDone() {}

    public int getId(){
        int id = 0;
        return id;
    }
}
