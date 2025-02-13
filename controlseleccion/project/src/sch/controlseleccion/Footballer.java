// 5.2.1 -> Package name only lowercase
package sch.controlseleccion;

// 5.2.2 -> Class names are written in UpperCamelCase
class Footballer extends Worker {

    // 5.2.5 Non constants field names are written in lowerCamelCase
    private int jersey;
    private String position;

    Footballer(int id, String name, String lastNames, int age, int jersey, String position) {
        super(id, name, lastNames, age);
        this.jersey = jersey;
        this.position = position;
    }

    // 5.2.6 -> Parameter names are written in lowerCamelCase
    public void playMatch(String rival) {
        System.out.printf("%s está jugando en contra de %s\n", super.getFullName(), rival);
    }

    // 5.2.3 -> Method names are written in lowerCamelCase 
    public void train() {
        System.out.printf("%s está entrenando...\n", super.getFullName());
    }

    // 5.2.3 -> Method names are written in lowerCamelCase 
    public int getJersey() {
        return this.jersey;
    }

    // 5.2.6 -> Parameter names are written in lowerCamelCase
    public void setJersey(int jersey) {
        this.jersey = jersey;
    }

    // 5.2.3 -> Method names are written in lowerCamelCase 
    public String getPosition() {
        return this.position;
    }

    // 5.2.6 -> Parameter names are written in lowerCamelCase
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    // 5.2.3 -> Method names are written in lowerCamelCase 
    public String toString() {
        return String.format("%d\t%s\t%d\t%d\t%s", super.getId(), super.getFullName(), super.getAge(), this.jersey, this.position);
    }
}
