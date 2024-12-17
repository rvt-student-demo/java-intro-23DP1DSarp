package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class App 
{
   // Comma separeted values

   // Izlasīt persons.csv izmantojot BufferedReader objektu
    
        
           
        
            public static void main(String[] args) throws Exception{
                
                Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
                Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
                Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

                System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));  // false
                System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));   // true

            

        }
    
    
    }



        





