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
        

       

        Integer numberCount = 0;
        
        Integer numberSum = 0;

       while (true) {

        System.out.println("Give a number:");

        Integer number = Integer.valueOf(scanner.nextLine());

        numberCount = numberCount + 1;

        numberSum = number + numberSum;

        if(number == 0) {
            System.out.println("Number of numbers:" + numberCount);
            System.out.println("Sum of the numbers:" + numberSum);
            break;
        }






       }
        
        



        

    }

}
