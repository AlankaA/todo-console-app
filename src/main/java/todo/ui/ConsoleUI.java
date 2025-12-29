package todo.ui;

import todo.model.Task;
import todo.service.TaskService;

import java.util.List;

public class ConsoleUI {
    private final InputReader reader;
    private final Messages messages;
    private final ConsolePrinter printer;
    private final InputValidator validator;
    private final TaskService taskService;

    public ConsoleUI(InputReader reader, Messages messages,
                     ConsolePrinter printer, InputValidator validator, TaskService taskService) {
        this.reader = reader;
        this.messages = messages;
        this.printer = printer;
        this.validator = validator;
        this.taskService = taskService;
    }

    public String readNonEmptyInput(String prompt) {
        while (true) {
            printer.print(prompt);
            String input = reader.readInput();
            if (!validator.isNotEmpty(input)) {
                printer.printError(messages.emptyIsNotAllowed());
                continue;
            }
            return input.trim();
        }
    }

    public int readNonNegativeInteger(String prompt) {
        while (true) {
            String input = readNonEmptyInput(prompt);
            try {
                int parsedInt = Integer.parseInt(input);
                if (!validator.isNotNegative(parsedInt)) {
                    printer.printError(messages.negativeInputAllowed());
                    continue;
                }
                return parsedInt;
            } catch (NumberFormatException e) {
                printer.printError(messages.enterInteger());
            }
        }
    }


    public int menuChoice() {
        while (true) {
            try {
                String input = readNonEmptyInput(messages.menu());
                int parsedInput = Integer.parseInt(input);
                if (!validator.isValidMenuChoice(parsedInput)) {
                    printer.printError(messages.menuInvalidOption());
                    continue;
                }
                return parsedInput;
            } catch (NumberFormatException e) {
                printer.printError(messages.enterInteger());
            }
        }
    }

    public void start() {
        int choice = 0;
        while (choice != 6) {
            choice = menuChoice();
            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    deleteTask();
                    break;
                case 3:
                    updateTask();
                    break;
                case 4:
                    getListTask();
                    break;
                case 5:
                    markTaskDone();
                    break;
                case 6:
                    exit();
                    break;
            }
        }
    }

    public void addTask() {
        String name = readNonEmptyInput(messages.taskName());
        String description = readNonEmptyInput(messages.taskDescription());

        taskService.addTask(name, description);
        printer.printInfo(messages.taskAdded());
    }

    public void deleteTask() {
        List<Task> tasks = taskService.getListTask();
        if (tasks.isEmpty()) {
            printer.printInfo(messages.nothingToDelete());
            return;
        }

        int id = readNonNegativeInteger(messages.taskId());

        taskService.deleteTask(id);
        printer.printInfo(messages.taskDeleted());
    }

    public void updateTask() {
        taskService.updateTask();
        printer.printInfo(messages.taskUpdated());
    }

    public void getListTask() {
        List<Task> tasks = taskService.getListTask();
        if (tasks.isEmpty()) {
            printer.printInfo(messages.emptyTaskList());
            return;
        }

        printer.print(messages.taskList());
        for (Task task : tasks)
            printer.print(task.getId() + ". " + task.getName());
    }

    public void markTaskDone() {
        taskService.markTaskDone();
        printer.printInfo(messages.taskDone());
    }

    public void exit() {
        printer.printInfo(messages.exit());
    }

    public void finish() {
        printer.printInfo(messages.finished());
    }
}
