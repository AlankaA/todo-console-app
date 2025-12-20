package todo.ui;

import todo.model.Task;

public class ConsoleUI {
    private final InputReader reader;
    private final Messages messages;
    private final ConsolePrinter printer;
    private final InputValidator validator;

    public ConsoleUI(InputReader reader, Messages messages, ConsolePrinter printer, InputValidator validator) {
        this.reader = reader;
        this.messages = messages;
        this.printer = printer;
        this.validator = validator;
    }


    public int start() {
        while (true) {
            try {
                printer.print(messages.menu());
                String input = reader.readInput();
                input = input.trim();
                if (input.isEmpty()) {
                    printer.printError(messages.emptyIsNotAllowed());
                    continue;
                }
                int parsedInput = Integer.parseInt(input);
                if (!validator.validateMenuInput(parsedInput)) {
                    printer.printError(messages.menuInvalidOption());
                    continue;
                }
                return parsedInput;
            } catch (NumberFormatException e) {
                printer.printError(messages.enterInteger());
            }
        }
    }
}
