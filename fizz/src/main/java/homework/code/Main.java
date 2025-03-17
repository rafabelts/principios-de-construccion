package homework.code;
import homework.code.ArgumentPaser;
import homework.code.ConsoleBasedFizzBuzz;

public class Main {
    public static void main(String[] args) {
        try {
            ArgumentPaser argumentPaser = new ArgumentPaser(args);
            ConsoleBasedFizzBuzz fizzBuzz = new ConsoleBasedFizzBuzz();

            fizzBuzz.printResult(1, argumentPaser.getValue());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}