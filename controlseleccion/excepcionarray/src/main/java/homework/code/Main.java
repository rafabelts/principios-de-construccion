package homework.code;

public class Main {

    public static int[] arr = {1, 2, 3, 4, 5};

    public static int getElementOfArray(int[] array, int index) throws ArrayIndexOutOfBoundsException {
        if(index < 0 || index >= array.length) {
          throw new ArrayIndexOutOfBoundsException("Out of bound");
        }

        return array[index];
    }

    public static void main(String[] args) {
       try {
           System.out.println(getElementOfArray(arr, 4));

           System.out.println(getElementOfArray(arr, 5));

       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println(e.getMessage());
       }
    }
}