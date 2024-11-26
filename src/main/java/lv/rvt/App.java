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

        
        

        String line;

        reader.readLine(); // Title row - Mēs ignorējam 1 rindu

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
   
}


        





