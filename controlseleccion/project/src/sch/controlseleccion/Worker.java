// 5.2.1 -> Package name only lowercase
package sch.controlseleccion;

// 5.2.2 -> Class names are written in UpperCamelCase
class Worker {

    // 5.2.5 -> Non constants field names are written in lowerCamelCase
    private int id;
    private String name;
    private String lastNames;
    private int age;

    Worker(int id, String name, String lastNames, int age) {
        this.id = id;
        this.name = name;
        this.lastNames = lastNames;
        this.age = age;
    }

    // 5.2.3 -> Method names are written in lowerCamelCase 
    protected int getId() {
        return this.id;
    }

    // 5.2.6 -> Parameter names are written in lowerCamelCase
    public void setId(int id) {
        this.id = id;
    }

    // 5.2.3 -> Method names are written in lowerCamelCase 
    protected String getFullName() {
        return String.format("%s %s", this.name, this.lastNames);
    }

    // 5.2.3 -> Method names are written in lowerCamelCase 
    protected String getName() {
        return this.name;
    }

    // 5.2.6 -> Parameter names are written in lowerCamelCase
    protected void setName(String name) {
        this.name = name;
    }

    // 5.2.3 -> Method names are written in lowerCamelCase 
    protected String getLastNames() {
        return this.lastNames;
    }

    // 5.2.6 -> Parameter names are written in lowerCamelCase
    protected void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    // 5.2.3 -> Method names are written in lowerCamelCase 
    protected int getAge() {
        return this.age;
    }

    // 5.2.6 -> Parameter names are written in lowerCamelCase
    protected void setAge(int age) {
        this.age = age;
    }

    // 5.2.6 -> Parameter names are written in lowerCamelCase
    public void focus(String technic) {
        System.out.printf("%s está concentrandose usando la tecnica de %s\n", this.getFullName(), technic);
    }

    // 5.2.6 -> Parameter names are written in lowerCamelCase
    public void travel(String destination) {
        System.out.printf("%s está viajado a %s\n", this.getFullName(), destination);
    }

    @Override
    // 5.2.3 -> Method names are written in lowerCamelCase 
    public String toString() {
        return String.format("Id: %d. Name: %s %s. Age: %d", this.id, this.name, this.lastNames, this.age);
    }
}
