package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {


        printStars(5);
        printStars(3);
        printStars(9);

        System.out.println("");

        printSquare(4);

        System.out.println("");

        printRectangle(17, 3);

        System.out.println("");

        printTriangle(4);

        
        
       }

       public static void printStars(int intNumber) {

            int startNumber = 1;

            while(startNumber <= intNumber){
                System.out.print("*");
                startNumber++;
            }
            System.out.println("");
        }

        public static void printSquare(int intSize) {

            int startLineNumber = 1;
            int startRowNumber = 1;

            while(startRowNumber <= intSize){
                while(startLineNumber <= intSize){
                    System.out.print("*");
                    startLineNumber++;
                }
               System.out.println("");
               startRowNumber++;
               startLineNumber = 1;
            }

        }

        public static void printRectangle(int width, int height) {

            int startLineNumber = 1;
            int startRowNumber = 1;

            while(startRowNumber <= height){
                while(startLineNumber <= width){
                    System.out.print("*");
                    startLineNumber++;
                }
               System.out.println("");
               startRowNumber++;
               startLineNumber = 1;
            }    
            
        }

        public static void printTriangle(int size) {

            int startLineNumber = 1;
            int startRowNumber = 1;

            
                while(startRowNumber <= size){
                    while(startLineNumber <= startRowNumber){
                    System.out.print("*");
                    startLineNumber++;
                    }

                System.out.println("");
                startLineNumber = 1;
                startRowNumber++;

                }
              
            
        }


        
}
            




