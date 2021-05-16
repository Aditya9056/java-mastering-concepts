/**
 * object_creation
 */
class Calculation{  
    void fact(int  n){  
     int fact=1;  
     for(int i=1;i<=n;i++){  
      fact=fact*i;  
     }  
    System.out.println("factorial is "+fact);  
   }
} 

public class object_creation {

    public static void main(String[] args) {

        new Calculation().fact(5);
    }
}