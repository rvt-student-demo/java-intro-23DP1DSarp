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

        System.out.println("Last number?");
        
        Integer number = Integer.valueOf(scanner.nextLine());

        int numberSum = 0;

        for (int i = 0; i <= number; i++) {
            
            numberSum += i;
        }  

        System.out.println("The sum is: " + numberSum);
       }
            

}


