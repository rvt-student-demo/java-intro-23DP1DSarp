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
    
        
           
        
            public static void main(String[] args) {
                // example main program for the first section of the exercise
            
                HealthStation childrensHospital = new HealthStation();

                Person ethan = new Person("Ethan", 1, 110, 7);
                Person peter = new Person("Peter", 33, 176, 85);

                System.out.println("weighings performed: " + childrensHospital.weighings());

                childrensHospital.weigh(ethan);
                childrensHospital.weigh(peter);

                System.out.println("weighings performed: " + childrensHospital.weighings());

                childrensHospital.weigh(ethan);
                childrensHospital.weigh(ethan);
                childrensHospital.weigh(ethan);
                childrensHospital.weigh(ethan);

                System.out.println("weighings performed: " + childrensHospital.weighings());
            }

            

        }
    
    




        





