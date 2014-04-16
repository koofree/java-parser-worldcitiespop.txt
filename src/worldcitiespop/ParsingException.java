package worldcitiespop;

public class ParsingException extends RuntimeException {

    private final String message;

    public ParsingException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
