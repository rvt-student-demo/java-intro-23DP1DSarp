package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {


        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times?");

        Integer times = Integer.valueOf(scanner.nextLine());

        for (int i=0; i < times; i++){
            printText();
        }
        
       }

       public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
       }
            

}


