package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import lv.rvt.ConsoleColors;
import java.util.*;

public class App 
{
   
    
        
           
    public static void main(String[] args) {
        

        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Arthur", 10.5);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
                
        
        
        
        
        
        

    }
    
    
    
    }



        





