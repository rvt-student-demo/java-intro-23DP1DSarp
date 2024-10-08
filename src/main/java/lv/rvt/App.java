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

            int startLineNumber = 1;
            int startRowNumber = 1;
            int starCount = 1;
            int counter = 1;
            
            for(int i = 0; i < height + 3; i++ ){
                printSpaces(startLineNumber, height);

                printStars(startLineNumber, height, counter);

                System.out.println("");
                counter = counter + 2;
                height--;
            }
            
            for (int i = 0; i <= height + 1; i++) {
                for (int a = 0; a <= height + 1; a++) {
                System.out.print(" ");
                
                }


                for (int j = 0; j <= height; j++) {
                System.out.println("ooo");
                
                }

            }
            
            
            
        }

            public static void printSpaces(int startLineNumber, int height){
                for (int i = 0; i <= height - 2; i++) {
                    System.out.print(" ");
                    
                    
                }
            }

            public static void printStars(int startLineNumber, int height, int counter){
                for (int i = 0; i <= counter - 1; i++) {
                    System.out.print("*");
                }

        

        }

    }


