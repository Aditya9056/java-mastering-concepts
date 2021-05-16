public class oop_class{
    int age =12;
    String name;
    double salary;

    public void settr(){
        this.age = 14;
        this.name ="Raj Singh";
        this.salary = 45000;
    }

    public static void main(String[] args){

        oop_class Raj = new oop_class();
        Raj.settr();
        System.out.println(Raj.age);

    }

}