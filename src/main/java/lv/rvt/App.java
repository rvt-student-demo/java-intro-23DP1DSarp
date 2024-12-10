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
           
        

            Scanner scanner = new Scanner(System.in);

            boolean isProgramRunning = true;

            System.out.println("Welcome to person manager, type \"help\" to see avaliable commands");

            System.out.println("Hello, choose your command: ");
            System.out.println("show - shows all persons");
            System.out.println("add - add a person");
            System.out.println("exit - add a person");
            

            while (true) {

                
                

                String command = scanner.nextLine();
            

            if (command.equals("show")) {
                ArrayList<Person> persons = PersonManager.getPersonList();
                System.out.println("Person list: ");
                for(Person person : persons){
                    System.out.printf("| %s |  | %s | | %s | | %s |\n", person.getName(), person.getAge(), person.getWeight(), person.getHeight());
                }
            }
            else if (command.equals("add")) {
                System.out.println("Please enter name: ");
                String name = scanner.nextLine();
                System.out.println("Please enter age: ");
                int age = Integer.valueOf(scanner.nextLine());
                System.out.println("Please enter weight: ");
                int weight = Integer.valueOf(scanner.nextLine());
                System.out.println("Please enter height: ");
                int height = Integer.valueOf(scanner.nextLine());

                Person person = new Person (name, age, weight, height);
                PersonManager.addPerson(person);

            }
            else if (command.equals("exit")) {
                break;
            } 
            else if (command.equals("help")){
                System.out.println(" ");
                System.out.println("show - shows all persons");
                System.out.println("add - add a person");
                System.out.println("help - shows all avaliable commands");
                System.out.println("exit - add a person");
            }
            
            System.out.println(" ");
        }
            
            

            System.out.println("Bye bye");


   

    
    }

}


        





