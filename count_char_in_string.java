/**
 * count_char_in_string
 */
public class count_char_in_string {

    public static int count(String a1) {
        
        int len = 0,i;

        for(i=0; i<a1.length(); i++){
            if(a1.charAt(i) != ' ')
            {
                len++;
            }
        }
    
        return len;
    }

    public static void main(String args[]) {
    
        String name = "ADITYdfdfd A";
        System.out.println(count(name));
    }
}