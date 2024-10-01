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

        System.out.println("Give numbers:");
        

        int numberSum = 0;
        int numberCount = 0;
        double numberAverage = 0;
        int numberEven = 0;
        int numberOdd = 0;
        

        while (true) {
            
            Integer number = Integer.valueOf(scanner.nextLine());
            
            if (number < 0) {
                System.out.println("Thx! Bye!");
                break;
            }



            numberSum = numberSum + number;
            numberCount++;
            numberAverage = numberSum / numberCount;
            
            if (number % 2 == 0) {
                numberEven++;
            } else {
                numberOdd++;
            }


        }

        System.out.println("Sum: " + numberSum);
        System.out.println("Numbers: " + numberCount);
        System.out.println("Average: " + numberAverage);
        System.out.println("Even: " + numberEven);
        System.out.println("Odd: " + numberOdd);



       }
            

}


