package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class App 
{
   
    
        
           
        
            public static void main(String[] args) throws Exception{
                
                ArrayList<Person> persons = new ArrayList<Person>();
                persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
                persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

                printPersons(persons);

        }

        public static void printPersons(ArrayList<Person> persons){
            for(Person countPerson : persons) {
                System.out.println(countPerson);
            }
        }
    
    
    }



        





