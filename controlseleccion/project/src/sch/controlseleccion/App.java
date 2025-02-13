// 5.2.1 -> Package name only lowercase
package sch.controlseleccion;

// 5.2.2 -> Class names are written in UpperCamelCase
public class App {

    public static void main(String[] args) {
        Footballer vanDijk = new Footballer(0, "Virgil", "Van Djik", 33, 4, "Defensa");
        System.out.println("Id\tNombre\t\tEdad\tJersey\tPosicion");
        System.out.println(vanDijk.toString());

        System.out.println();

        vanDijk.travel("España");
        vanDijk.focus("Meditacion");
        vanDijk.playMatch("España");
        vanDijk.train();

        System.out.println();

        Coach luisEnrique = new Coach(1, "Luis", "Enrique", 54, 10);
        System.out.println("Id\tNombre\t\tEdad\tId de Federacion");
        System.out.println(luisEnrique.toString());

        System.out.println();

        luisEnrique.travel("Alemania");
        luisEnrique.focus("Respiracion");
        luisEnrique.directMatch("Alemania");
        luisEnrique.directTrainning();

        System.out.println();

        Masseuse pabloMorsa = new Masseuse(2, "Pablo", "Morsa", 30, "Fisioterapia", 4);
        System.out.println("Id\tNombre\t\tEdad\tEspecialidad\tAños de experiencia");
        System.out.println(pabloMorsa.toString());

        System.out.println();

        pabloMorsa.travel("España");
        pabloMorsa.focus("Meditacion");
        pabloMorsa.giveMassage(vanDijk);
    }
}
