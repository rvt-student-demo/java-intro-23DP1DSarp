package lv.rvt;

import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class PersonManager {
    public static ArrayList<Person> getPersonList() throws Exception{


      ArrayList<Person> persons = new ArrayList<>();


      BufferedReader reader = Helper.getReader("persons.csv");

        
        int age = 0;
        int ageCount = 0;
        double ageAverage = 0.0;

        String line;

        reader.readLine();

        Person person1 = new Person("Maija", 36, 46.0, 176.5);

      while ((line = reader.readLine()) != null) {
        

        String [] parts = line.split(", ");

        System.out.println(parts[0] + " " + parts[1] + " " + parts[2] + " " + parts[3]);

        
      }


      

      persons.add(person1);

      return persons;

    }

    
           

    
}

