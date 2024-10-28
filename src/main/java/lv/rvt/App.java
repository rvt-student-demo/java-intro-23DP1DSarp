package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {

        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int longestWord = 0;

        String word = "";

        
        
        

        while (true) {

            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }
        
            String[] parts = input.split(",");
            sum = sum + Integer.valueOf(parts[1]);
            count = count + 1;

            for (int i = 0; i < parts.length; i++) {
                        
                String length = String.valueOf(parts[i]);
                int wordLength = length.length();

                if (wordLength > longestWord){
                    longestWord = wordLength;
                    word = parts[i];
                }

            }

        }

        
        System.out.println("Longest name:" + word);


        if (count > 0) {
            System.out.println("Age average: " + (1.0 * sum / count));
        } else {
            System.out.println("No input.");
        }
            
        
    }

}    


