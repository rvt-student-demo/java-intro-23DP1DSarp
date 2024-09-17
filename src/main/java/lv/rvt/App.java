package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // Izveidojam skaneri vienu reizi un pielietojam visā programmā
        
        Scanner scanner = new Scanner(System.in);
        

        int number1 = Integer.valueOf(scanner.nextLine());
        int number2 = Integer.valueOf(scanner.nextLine());
        

        // Salīdzinām divus ciparus

        if (number1 > number2) {

            System.out.println("Greater number is: " + number1);


        } else if (number1 < number2) {

            System.out.println("Greater number is: " + number2);

        } else {

            System.out.println("The numbers are equal!");

        }
        
        



        

    }

}
