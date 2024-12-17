package lv.rvt;

import java.nio.file.Paths;
import java.util.Scanner;

public class Person {


        private String name;
        private SimpleDate birthday;
        private int height;
        private int weight;
    
        // ...
    
  
    


    


    public int ageAsYears(){
        

        if (muhammad.ageAsYears() > pascal.ageAsYears()) {
            System.out.println(muhammad.getName() + " is older than " + pascal.getName());
        }
    }

    boolean olderThan(Person compared){
        

        if (muhammad.olderThan(pascal)) {  //  same as muhammad.olderThan(pascal)==true
            System.out.println(muhammad.getName() + " is older than " + pascal.getName());
        } else {
            System.out.println(muhammad.getName() + " is not older than " + pascal.getName());
        }
    }

    public String toString() {
        return this.name + " " + this.age + " "
            + this.weight + " " + this.height + bodyMassIndex();
    }
}
