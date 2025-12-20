package todo;

import todo.service.TaskService;
import todo.ui.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        final TaskService taskService = new TaskService();
        final ConsolePrinter printer = new ConsolePrinter();
        final Scanner input = new Scanner(System.in);
        final InputReader reader = new InputReader(input);
        final InputValidator validator = new InputValidator();
        final Messages messages = new Messages();
        final ConsoleUI console = new ConsoleUI(reader, messages, printer, validator);


        int choice = 0;
        while (choice != 6) {
            choice = console.start();
            switch (choice) {
                case 1:
                    taskService.addTask();
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
                    printer.printInfo(messages.exit());
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected menu option: " + choice);
            }
        }
        printer.printInfo(messages.finished());
    }
}