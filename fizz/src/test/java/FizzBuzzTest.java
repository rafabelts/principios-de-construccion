import homework.code.ConsoleBasedFizzBuzz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    static ConsoleBasedFizzBuzz consoleBasedFizzBuzz = new ConsoleBasedFizzBuzz();

    @Test
    @DisplayName("Evaluate divisable by 3 and 5")
    void evaluateDivisableBy3And5() {
        String evaluator = consoleBasedFizzBuzz.getFizzBuzzValue(15);
        assertEquals("FizzBuzz", evaluator);
    }

    @Test
    @DisplayName("Evaluate divisable by 3")
    void evaluateDivisableBy3() {
        String evaluator = consoleBasedFizzBuzz.getFizzBuzzValue(3);
        assertEquals("Fizz", evaluator);
    }

    @Test
    @DisplayName("Evaluate divisable by 5")
    void evaluateDivisableBy5() {
        String evaluator = consoleBasedFizzBuzz.getFizzBuzzValue(5);
        assertEquals("Buzz", evaluator);
    }

    @Test
    @DisplayName("Evaluate not divisable")
    void evaluateNotDivisable() {
        String evaluator = consoleBasedFizzBuzz.getFizzBuzzValue(2);
        assertEquals("2", evaluator);
    }
}