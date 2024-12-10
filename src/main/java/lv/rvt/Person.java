package lv.rvt;

import java.nio.file.Paths;
import java.util.Scanner;

public class Person {

    private String name;
    private int age;
    private double weight;
    private double height;

    public Person(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String name(String name) {
        return this.name;
    }

    public int age() {
        return age; 
    }

    public String toCsvRow(){
        return this.name + ", " + this.age + ", " + this.weight + ", " + this.height;
    }

    public String toString() {
        return this.name + " " + this.age + " "
            + this.weight + " " + this.height;
    }
}
