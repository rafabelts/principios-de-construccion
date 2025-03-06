package homework.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {
    int result;
    String operator;
    List<String> operations = Arrays.asList("+", "-", ".", "/");

    Calculator(String operator) {
        try {
            checkOperator(operator);
            this.operator = operator;
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage() + ": " + operator);
            System.exit(0);
        }
    }

    void checkOperator(String operator) throws IllegalArgumentException {
            System.out.println(operations.contains(operator));
            if (!operations.contains(operator)) {
            throw new ArithmeticException("Invalid operator");
        }
    }

    void operation(int num1, int num2) throws ArithmeticException {
        switch (this.operator) {
            case "+" ->  result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "." ->  result = num1 * num2;
            case "/" -> {
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                result = 0;
            }
        }
    }

    int getResult(int num1, int num2) {
        try {
            operation(num1, num2);
        }  catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
        return this.result;
    }
}