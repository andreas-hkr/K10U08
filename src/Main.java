import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Läs in nederbörd/år från en fil och visa ett diagram
        //  År     0         1         2         3 x 1000 mm
        // 2011    ***************
        // 2012    *************************
        // 2013    ************

        Scanner fileIn = new Scanner(new File("data.txt"));

        System.out.println(" År    0         1         2         3 x 1000 mm");
        while (fileIn.hasNextLine()) {
            int year = fileIn.nextInt();
            int amount = fileIn.nextInt();
            amount /= 100;

            System.out.print(year + "   ");
            for(int i=0; i <= amount; i++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}