package todo;

import todo.service.TaskService;
import todo.ui.ConsoleUI;
import todo.ui.Messages;


public class Main {
    public static void main(String[] args) {
        Messages message = new Messages();
        TaskService task = new TaskService();
        ConsoleUI console = new ConsoleUI();


        int choise = 0;
        while (choise != 6) {
            choise = console.start();
            switch (choise) {
                case 1:
                    task.addTask();
                    break;
                case 2:
                    task.deleteTask();
                    break;
                case 3:
                    task.updateTask();
                    break;
                case 4:
                    task.getListTask();
                    break;
                case 5:
                    task.markTaskDone();
                    break;
                case 6:
                    message.printExit();
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected menu option: " + choise);
            }
        }
        message.printFinished();
    }
}