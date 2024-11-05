package lv.rvt;

public class Person {

    private String name;
    private int age;

    public static void main(String[] args) {
        Person ada = new Person("Ada");
        Person antti = new Person("Antti");
        Person martin = new Person("Martin");

        ada.printPerson();
        antti.printPerson();
        martin.printPerson();
    }

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    // Getter method

    public String getGroup() {
        return this.
        group;
    }


    // Setter method

    public String setGroup() {
        this.group = group;
    }

}
