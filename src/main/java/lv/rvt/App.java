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

        ArrayList<String> wordList = new ArrayList<>();

        String name = scanner.nextLine();


        while (name != "") {
            name = scanner.nextLine();
            wordList.add(name);
        }
       
        System.out.println(wordList.get(2));
        
       }

       

}
