package todo.ui;

public class ConsoleUI {
    InputValidator validator = new InputValidator();
    InputReader reader = new InputReader();
    Messages message = new Messages();

    public int start() {
        while (true) {
            try {
                String input = reader.readInput(message.printMenu());
                input = input.trim();
                if (input.isEmpty()) {
                    message.printEmptyIsNotAllowed();
                    continue;
                }
                int parsedInput = Integer.parseInt(input);
                validator.validateMenuInput(parsedInput);
                if (validator.validateMenuInput(parsedInput)) {
                    return parsedInput;
                }
                if (!validator.validateMenuInput(parsedInput)) {
                    message.printMenuInvalidOption();
                    continue;
                }

            } catch (NumberFormatException e) {
                message.printEnterInteger();
            }
        }
    }
}
