import java.io.*;


public class input_reading_advance {

    public static void main(String[] args) throws NumberFormatException, IOException {

        // BufferedReader
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        int name = Integer.parseInt(br.readLine());//use string for string input
        System.out.println("Welcome! "+ name);  

    }

}