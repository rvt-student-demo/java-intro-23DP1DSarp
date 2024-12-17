package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
/* 
public class PersonManager {
    public static ArrayList<Person> getPersonList() throws Exception{


      ArrayList<Person> persons = new ArrayList<>();


      BufferedReader reader = Helper.getReader("persons.csv");

        
        int age = 0;
        int ageCount = 0;
        double ageAverage = 0.0;

        String line;

        reader.readLine();

        


      while ((line = reader.readLine()) != null) {
        
        String [] parts = line.split(", ");

        //Person person1 = new Person(parts[0],  Integer.valueOf(parts[1]),  Double.valueOf(parts[2]), Double.valueOf(parts[3]));

        //persons.add(person1);
        
      }


      

      

        return persons;

    }

    public static void addPerson(Person person) throws Exception{
        BufferedWriter writer = Helper.getWriter("persons.csv", StandardOpenOption.APPEND);
        writer.write(person.toCsvRow());
        writer.newLine();
        writer.close();
    }

  


     
           

    
}

*/