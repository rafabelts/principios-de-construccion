package homework.code;

public class ConsoleBasedFizzBuzz implements FizzBuzz {

    // extract method
    public String getFizzBuzzValue(int number) {
         StringBuilder result = new StringBuilder();

         // substitute algorithm
         if(number % 3 == 0) {
             result.append("Fizz");
         }

         if(number % 5 == 0) {
             result.append("Buzz");
         }

         // replace temp with query
        return result.isEmpty() ? String.valueOf(number) : result.toString();
    }

    public void printResult(int from, int to) {
        for (int i = from; i <= to; i++) {
           System.out.println(getFizzBuzzValue(i));
        }
    }
}
