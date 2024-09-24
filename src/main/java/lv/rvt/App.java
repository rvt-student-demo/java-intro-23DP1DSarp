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
        
        Integer number = Integer.valueOf(scanner.nextLine());

       

        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }  


       }
            

}


