package lv.rvt;

import java.nio.file.Paths;
import java.util.Scanner;

public class Person {

    private String name;
    private String adress;
    private int salary;
    
    

    public Person(String name, String adress){
        this.name = name;
        this.adress = adress;
    }

    public Person(String name, String adress, int salary){
        this.name = name;
        this.adress = adress;
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public String toString() {
        return this.name + "\n  " + this.adress;
    }
    


}
