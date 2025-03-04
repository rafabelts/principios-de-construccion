package homework.code;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args)  {
        ConsoleBasedFizzBuzz fizzbuzz = new ConsoleBasedFizzBuzz();

        fizzbuzz.rint(1, 100);
    }
}