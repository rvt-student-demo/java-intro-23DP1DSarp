package lv.rvt;

import java.nio.file.Paths;
import java.util.Scanner;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int weight = 0;
    private int length = 0;
    
  
    

    public Person(String name, SimpleDate date) {
        this.name = name;
        this.birthday = date;
    }

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    public String toString() {
        return this.name + ", born on " + this.birthday;
    }
    


}
