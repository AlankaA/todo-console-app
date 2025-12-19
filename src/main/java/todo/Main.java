package todo;

import todo.service.TaskService;
import todo.ui.*;


public class Main {
    public static void main(String[] args) {
        TaskService taskService = new TaskService();
        ConsolePrinter consolePrinter = new ConsolePrinter();
        ConsoleUI console = new ConsoleUI();
        Messages message = new Messages();


        int choise = 0;
        while (choise != 6) {
            choise = console.start();
            switch (choise) {
                case 1:
                    taskService.addTask(console.createTask());
                    break;
                case 2:
                    taskService.deleteTask();
                    break;
                case 3:
                    taskService.updateTask();
                    break;
                case 4:
                    taskService.getListTask();
                    break;
                case 5:
                    taskService.markTaskDone();
                    break;
                case 6:
                    consolePrinter.printInfo(message.exit());
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected menu option: " + choise);
            }
        }
        consolePrinter.printInfo(message.finished());
    }
}