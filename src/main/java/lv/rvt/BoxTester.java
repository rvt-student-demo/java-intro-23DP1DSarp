package lv.rvt;

import java.nio.file.Paths;
import java.util.Scanner;

public class BoxTester {
    

     public static void main ( String[] args ){

     Box box = new  Box( 2.5, 5.0, 6.0 ) ;

     Box box2 = new  Box( 2.5, 5.0, 6.0 ) ;

     System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );
     System.out.println( "topArea: "  + box.topArea() );

     System.out.println( "Area: "  + box2.area() + " volume: " + box2. volume() );
     System.out.println( "topArea: "  + box2.topArea() );

  }
}
