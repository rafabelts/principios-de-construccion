package homework.code;

public class Main {
    public static void main(String[] args) {
        try {
            if(args.length != 3){
                System.err.println("Usage: java Calculator num1 operand num2");
                System.exit(0);
            }

            int num1 = Integer.parseInt(args[0]);
            String operator = args[1];
            int num2 = Integer.parseInt(args[2]);

            Calculator calculator = new Calculator(operator);

            System.out.printf("%d %s %d = %d\n", num1, operator, num2, calculator.getResult(num1, num2));
        } catch (NumberFormatException e) {
            System.err.println("Entrada incorrecta: " +  e.getMessage());
        }
    }
}