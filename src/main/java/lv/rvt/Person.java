package lv.rvt;

import java.nio.file.Paths;
import java.util.Scanner;

public class Person {

    private String name;
    private int age;
    private int weight;
    private double height;

    public Person(String name, int age, double height, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double bodyMassIndex() {
        return this.weight / (this.height * this.height);
    }

    public int getWeight() {

            return weight;

    }

        
    public void setWeight(int newWeight) {

       this.weight = newWeight;

    }  
    

    public double getHeight() {
        return height;
    }


    


    

    

    public String toCsvRow(){
        return this.name + ", " + this.age + ", " + this.weight + ", " + this.height;
    }

    public String toString() {
        return this.name + " " + this.age + " "
            + this.weight + " " + this.height + bodyMassIndex();
    }
}
