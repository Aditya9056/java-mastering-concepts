import java.io.IOException;

/**
 * Standard input_reading
 */
public class input_reading {

    public static void main(String[] args) throws IOException {

        // char i = (char)System.in.read();
        // System.out.println(i);
        int i;
        String str = "";
        
        while((i = System.in.read()) != 13){
            str = str + (char)i;
        }
        System.out.println(str);
    }
}