package todo.service;

import todo.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    final ArrayList<Task> listTasks;
    private int nextId = 0;

    public TaskService() {
        listTasks = new ArrayList<>();
    }

    public void addTask(String name, String description) {
        nextId += 1;
        listTasks.add(new Task(nextId, name, description));
    }

    public void deleteTask(int id) {
        listTasks.remove(getTaskById(id));
    }

    public void updateTask(Task task, String name, String description) {
        task.setName(name);
        task.setDescription(description);
    }

    public List<Task> getListTask() {
        return listTasks;
    }

    public void markTaskDone() {
    }

    public Task getTaskById(int id) {
        for (Task task : listTasks)
            if (task.getId() == id) {
                return task;
            }
        return null;
    }
}
