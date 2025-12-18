package todo.ui;

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
                    consolePrinter.printError(message.EmptyIsNotAllowed());
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
}
