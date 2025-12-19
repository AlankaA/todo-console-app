package todo.ui;

import todo.model.Task;

public class ConsoleUI {
    InputValidator validator = new InputValidator();
    InputReader reader = new InputReader();
    Messages message = new Messages();
    ConsolePrinter consolePrinter = new ConsolePrinter();

    public int start() {
        while (true) {
            try {
                String input = reader.readInput(message.menu());
                input = input.trim();
                if (input.isEmpty()) {
                    consolePrinter.printError(message.emptyIsNotAllowed());
                    continue;
                }
                int parsedInput = Integer.parseInt(input);
                if (!validator.validateMenuInput(parsedInput)) {
                    consolePrinter.printError(message.menuInvalidOption());
                    continue;
                }
                return parsedInput;
            } catch (NumberFormatException e) {
                consolePrinter.printError(message.enterInteger());
            }
        }
    }

    public Task createTask() {
        while (true) {
            String taskName = reader.readInput(message.taskName());
            if (!validator.validateTaskName(taskName)) {
                consolePrinter.printError(message.emptyIsNotAllowed());
                continue;
            }

            String taskDescription = reader.readInput(message.taskDescription());
            if (!validator.validateDescription(taskDescription)) {
                continue;
            }
            Task task = new Task(1,taskName, taskDescription);
            return task;
        }
    }
}
