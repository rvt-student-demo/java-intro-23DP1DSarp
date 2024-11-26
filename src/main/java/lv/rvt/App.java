package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Paths;
import java.util.*;

public class App 
{
   // Comma separeted values

   // Izlasīt persons.csv izmantojot BufferedReader objektu
    public static void main(String[] args) throws Exception {
        BufferedReader reader = Helper.getReader("persons.csv");

        
        int age = 0;
        int ageCount = 0;
        double ageAverage = 0.0;

        String line;

        reader.readLine(); // Title row - Mēs ignorējam 1 rindu

        while ((line = reader.readLine()) != null) {
            System.out.println(line);

            String [] parts = line.split(", ");

            System.out.println("Name: " + parts[0] + "age: " + parts[1]);

            age = age + Integer.valueOf(parts[1]);

            ageCount = ageCount + 1;

            



            
            // Kā uzzināt personu vidējo vecumu no dotā csv faila?
        }


        ageAverage = (age / ageCount);

        System.out.println(ageAverage);
    }
   
}


        





