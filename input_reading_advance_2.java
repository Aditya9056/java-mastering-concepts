import java.io.*;
import java.util.Scanner;


public class input_reading_advance_2 {

    public static void main(String[] args) throws NumberFormatException, IOException {

        // Scanner
        String str = "";
        int i;

        Scanner name = new Scanner(System.in);

        // str = name.nextLine(); //for string
        // i = Integer.parseInt(name.nextLine());  //for string to integer

        i = name.nextInt(); //For direct Integer

        System.out.println("Hello "+i);
    }

}