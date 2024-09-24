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
        

        // Jautājam par dāvanas cenu

        System.out.println("Value of the gift?");

        double giftValue = Double.valueOf(scanner.nextLine());
        
        

        // Salīdzinām divus ciparus

        if (giftValue >= 5000 && giftValue < 25000 ) {

            System.out.println((100+(giftValue - 5000) * 0.08));

        } else if (giftValue >= 25000 && giftValue < 55000) {

            System.out.println((1700+(giftValue - 25000) * 0.10));

        } else if (giftValue >= 55000 && giftValue < 200000) {

            System.out.println((4700+(giftValue - 55000) * 0.12));

        } else if (giftValue >= 200000 && giftValue < 1000000) {

            System.out.println((22100+(giftValue - 200000) * 0.15));

        }  else if (giftValue >= 1000000 ) {

            System.out.println((142100+(giftValue - 1000000) * 0.17));

        }   else {

            System.out.println("No tax!");

        }
        
        



        

    }

}
