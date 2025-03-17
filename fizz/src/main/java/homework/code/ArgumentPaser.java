package homework.code;

// replace method with method object
public class ArgumentPaser {
    private final String[] args;

    public ArgumentPaser(String[] args) {
        this.args = args;
    }

    // replace temp with query
    int getValue() throws IllegalArgumentException{
        validateArgs();
        return parseInteger(args[0]);
    }

    // extract method
    void validateArgs() throws IllegalArgumentException {
        if(args.length != 1){
            throw new IllegalArgumentException("Wrong number of arguments provided");
        }
    }

    int parseInteger(String arg) throws IllegalArgumentException {
        try {
            return Integer.parseInt(arg);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number format: " + arg);
        }
    }

}
