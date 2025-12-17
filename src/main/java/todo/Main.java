package todo;
import todo.model.Task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Task task = new Task(1, "create structure", "create structure for todo project");

        System.out.println("Task Name: " + task.getName());

        String name = input.nextLine();
        task.setName(input, name);
        System.out.println("Task Name: " + task.getName());
    }
}
