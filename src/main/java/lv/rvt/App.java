package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Paths;
import java.util.*;

public class App 
{
   // Comma separeted values

   // Izlasīt persons.csv izmantojot BufferedReader objektu
    
        public static void main(String[] args) throws Exception{
            ArrayList<Person> Persons = PersonManager.getPersonList();

            for (Person person : Persons) {
                System.out.println(person);
            }
        }
   

    
}


        





