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
        

        int speed = Integer.valueOf(scanner.nextLine());
        

        // Ja ātrums pārsniedz 120, tad izvadām tekstu

        if (speed > 120) {

            System.out.println("Speeding ticket!");


        }
        
        



        

    }

}
