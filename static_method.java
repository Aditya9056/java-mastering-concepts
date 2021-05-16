/**
 * static_method
 */
class Calculate{ 
    // Static Block
    static{
        int i = 10;
        System.out.println("Statick Block is invoked" + i);
    } 
    
    int cube(int x) {
        return x * x * x;
    }
}

public class static_method {

    public static void main(String args[]) {

        Calculate n = new Calculate();

        int result = n.cube(6);

            System.out.println(result);

        }
}