package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {


        Scanner scanner = new Scanner(System.in);

    

        division(2, 10);
        
       }

       public static void division(int intFirst, int intSecond) {
        for (int i=intFirst; i < intSecond + 1; i++){
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
       }
            

}


