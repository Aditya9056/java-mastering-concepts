/**
 * this_calling_constructor
 */
class A{
    A(){System.out.println("Hello a");}
    A(int x){
        this();
        System.out.println("Hello b");
    }
}
 public class this_calling_constructor {
    public static void main(String[] args) {
        A obj = new A(10);
    }

}