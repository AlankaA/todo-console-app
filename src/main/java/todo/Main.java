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
        final ConsoleUI console = new ConsoleUI(reader, messages, printer, validator, taskService);


        console.start();
        console.finish();
    }
}