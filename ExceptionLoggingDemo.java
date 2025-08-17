import java.io.IOException;
import java.util.logging.*;

class InvalidAgeException2 extends Exception {
    public InvalidAgeException2(String message) {
        super(message);
    }
}

public class ExceptionLoggingDemo {
    private static final Logger logger = Logger.getLogger(ExceptionLoggingDemo.class.getName());

    public static void main(String[] args) throws IOException {
        // Setup logger to write to file
        FileHandler fh = new FileHandler("error.log", true);
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

        int age = 15;
        try {
            if (age < 18) {
                throw new InvalidAgeException2("Age must be at least 18!");
            }
            System.out.println("Valid age: " + age);
        } catch (InvalidAgeException2 e) {
            logger.severe("Exception caught: " + e.getMessage());
            System.out.println("Error logged to file: error.log");
        }
    }
}

