package homework.code;
import homework.code.*;

public class Main {
    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("no args");
            return;
        }

        int max = Integer.parseInt(args[0]);

        System.out.println(max);

        ConsoleBasedFizzBuzz fizzBuzz = new ConsoleBasedFizzBuzz();
        fizzBuzz.print(1, 100);
    }
}