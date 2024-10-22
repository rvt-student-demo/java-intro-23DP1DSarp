package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> integerList = new ArrayList<>();

       int number = Integer.valueOf(scanner.nextLine());


        while (number != -1){
            integerList.add(number);
            number = Integer.valueOf(scanner.nextLine());
        }

        System.out.println("From where? ");

        int startNum = Integer.valueOf(scanner.nextLine());

        System.out.println("To where? ");

        int endNum = Integer.valueOf(scanner.nextLine());

        while (startNum < endNum + 1){
            int indexNum = integerList.get(startNum);
            System.out.println(indexNum);
            startNum = startNum + 1;
        }
       
        
        
       }

       

}
