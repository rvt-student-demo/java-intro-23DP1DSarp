package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {


        printTriangle(4);

        System.out.println("");

        christmasTree(4);
        christmasTree(10);
        
        
       }

       

        public static void printTriangle(int size) {

            int startLineNumber = 1;
            int startRowNumber = 1;
            int starCount = 1;
            int counter = 1;
            

            
               
                    while(startRowNumber <= size){
                    
            
                    while(startLineNumber <= size+2){
                    System.out.print(" ");
                    size--;
                    startLineNumber++;
                    }
                    while (starCount <= counter) {
                        System.out.print("*");
                        starCount++;
                    }

                    counter++;
                    starCount = 1;
                    size = 4;
                    System.out.println("");
                    startRowNumber++;

                }
            
            
        }

        public static void christmasTree(int height) {

            int spacesNumber = 1;
            int counter = 1;
            
            for(int i = 0; i < height; i++ ){
                printSpaces(spacesNumber, height);

                printStars(spacesNumber, height, counter);

                System.out.println("");
                counter = counter + 2;
                spacesNumber--;
            }
            
        
            for (int i = 0; i < 2; i++) {
                for (int a = 0; a <= height - 2; a++) {
                System.out.print(" ");
                
                }
                
                System.out.println("***");
            
            }
            
            
            
        }

            public static void printSpaces(int spacesNumber, int height){
                for (int i = 0; i <= spacesNumber + height - 2; i++) {
                    System.out.print(" ");
                }
            }

            public static void printStars(int spacesNumber, int height, int counter){
                for (int i = 0; i <= counter - 1; i++) {
                    System.out.print("*");
                }

        

        }

    }


