// 5.2.1 -> Package name only lowercase
package sch.controlseleccion;

// 5.2.2 -> Class names are written in UpperCamelCase
class Coach extends Worker {

    // 5.2.5 -> Non constants field names are written in lowerCamelCase
    private int federationId;

    Coach(int id, String name, String lastNames, int age, int federationId) {
        super(id, name, lastNames, age);
        this.federationId = federationId;
    }

    // 5.2.6 -> Parameter names are written in lowerCamelCase
    public void directMatch(String rival) {
        System.out.printf("%s está dirigiendo partido en contra de %s\n", super.getFullName(), rival);
    }

    // 5.2.3 -> Method names are written in lowerCamelCase 
    public void directTrainning() {
        System.out.printf("%s está dirigiendo entrenamiento...\n", super.getFullName());
    }

    // 5.2.3 -> Method names are written in lowerCamelCase 
    public int getFederationId() {
        return federationId;
    }

    // 5.2.6 -> Parameter names are written in lowerCamelCase
    public void setFederationId(int federationId) {
        this.federationId = federationId;
    }

    @Override
    // 5.2.3 -> Method names are written in lowerCamelCase 
    public String toString() {
        return String.format("%d\t%s\t%d\t%d", super.getId(), super.getFullName(), super.getAge(), this.federationId);
    }
}
