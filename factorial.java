/**
 * factorial
 */
public class factorial {

    public static void main(String args[]) {

        int num = 1, j = 6;

            while(j>0)
            {
                System.out.println("Factorial Is = "+num);
                j--;
                num = num*j+num;
            }

        // System.out.println("Factorial Is = "+num);
    }
}