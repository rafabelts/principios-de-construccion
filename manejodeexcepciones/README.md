# Manejo de excepciones
### ¿Cuál es la ventaja de usar el manejo de excepciones?
La principal ventaja del manejo de excepciones es el poder separar la detección del error (en el metodo que es llamado) del manejo del mismo (en el metodo que llama).

### ¿Cuál de las siguientes declaraciones lanzara una excepción?
```java
System.out.println(1 / 0);
System.out.println(1.0 / 0);
```
El primero, ya que los números de punto flotante divididos por 0 no lanzan una excepción.

### Señala el problema del siguiente código. ¿El código lanza alguna excepción?
```java
long value = Long.MAX_VALUE + 1;
System.out.println(value);
```
El error es que se produce un **Integer overflow** ya que Java acepta un valor máximo de 9,223,372,036,854,775,807 y la expresión long.MAX_VALUE + 1 le añade un entero, sobre pasando el máximo aceptable.

No lanza una excepción pero ocasionara un error de compilación.

### ¿Qué hace la JVM cuando una excepción ocurre? ¿Cómo atrapas una excepción?
Crea un objeto de excepción que representa un error o condición que interrumpe el flujo normal del programa. Después la JVM busca un bloque try catch para la excepción. Si se encuentra el catch, se ejecutara el código correspondiente; sino, termina de forma anomala.

Para atrapar una excepción se usa un bloque try catch.
``` java
try {
    // código que puede lanzar una excepción
} catch (Exception ex) {
    // codigo para seguir con la excepción 
}
```

### ¿Cuál es la salida del siguiente código?
```java
public class Test {
    public static void main(String[] args) {
        try {
            int value = 30;
            if (value < 40)
                throw new Exception("value is too small");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Continue after the catch block");
    }
}
```
#### Salida con int = 30
Como 30 es menor que 40 se lanzará una Excepción con el mensaje "value es is too small", es por esto que la salida del programa será "value is to small".

#### Salida con int = 50
Como 50 es mayor que 40 no se lanza una excepción y el programa sigue con su flujo normal, es por esto que la salida del programa será "Continue after the catch block".

### Muestra el output de los siguietes códigos
``` java
// código A
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.print(i + " ");
            try {
                System.out.println(1 / 0);
            }
            catch (Exception ex) {
            }
        }
    }
}
```
La salida del código A sera: 0 1 <b>



```java
// código b
public class Test {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 2; i++) {
                System.out.print(i + " ");
                System.out.println(1 / 0);
            }
        }
        catch (Exception ex) {
        }
    }
}
```
La salida del código sera 0
