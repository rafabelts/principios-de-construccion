// 5.2.1 -> Package name only lowercase
package sch.controlseleccion;

// 5.2.2 -> Class names are written in UpperCamelCase
class Masseuse extends Worker {

    // 5.2.5 Non constants field names are written in lowerCamelCase
    private String speciality;
    private int yearsOfExperience;

    Masseuse(int id, String name, String lastNames, int age, String speciality, int yearsOfExperience) {
        super(id, name, lastNames, age);

        this.speciality = speciality;
        this.yearsOfExperience = yearsOfExperience;
    }

    // 5.2.6 -> Parameter names are written in lowerCamelCase
    public void giveMassage(Footballer footballer) {
        System.out.printf("%s está masajeando a %s\n", super.getFullName(), footballer.getFullName());
    }

    // 5.2.3 -> Method names are written in lowerCamelCase 
    public String getSpeciality() {
        return this.speciality;
    }

    // 5.2.6 -> Parameter names are written in lowerCamelCase
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    // 5.2.3 -> Method names are written in lowerCamelCase 
    public int getYearsOfExperience() {
        return this.yearsOfExperience;
    }

    // 5.2.6 -> Parameter names are written in lowerCamelCase
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    // 5.2.3 -> Method names are written in lowerCamelCase 
    public String toString() {
        return String.format("%d\t%s\t%d\t%s\t%d", super.getId(), super.getFullName(), super.getAge(), this.speciality, this.yearsOfExperience);
    }
}
