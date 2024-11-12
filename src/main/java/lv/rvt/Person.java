package lv.rvt;

import java.nio.file.Paths;
import java.util.Scanner;

public class Person {

    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }

    public Person(String name2, int age2) {
        //TODO Auto-generated constructor stub
    }

    public Person(String string, String string2, String string3, String string4) {
        //TODO Auto-generated constructor stub
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightDivByHundred = this.height / 100.0;
        return this.weight / (heightDivByHundred * heightDivByHundred);
    }

    

    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }

    public static void main(String[] args) {
        Person person = new Person("Dan");
        System.out.println(person);
    }

    // Getter method
    /* 
    public String getGroup() {
        return this.
        group;
    }
    
    */

    // Setter method

    /* 
    public String setGroup() {
        this.group = group;
    }
    */
}
