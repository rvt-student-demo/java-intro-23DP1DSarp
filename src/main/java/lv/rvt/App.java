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

        System.out.println("Ievadiet savu vārdu: ");

        String firstName = scanner.nextLine();

        System.out.println("Ievadiet savu uzvārdu: ");

        String lastName = scanner.nextLine();

        System.out.println("Ievadiet savu grupu: ");

        String group = scanner.nextLine();

        System.out.println("Sveiki, " + firstName + " " + lastName + " " + group + ". Prieks jūs redzēt!");
    }

}
