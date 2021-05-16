/**
 * static_use
 */
// If there would be more students then compiler dont have to use seprate mem for the college it will be static and common for all because it's Same!!
class student{
    String name;
    static String clg = "TMU";

    void setData(String name){
        this.name = name;
    }
}

public class static_use {

    public static void main(String[] args) {
        student ram = new student();
        ram.setData("Ram");

        System.out.println(ram.name);
        System.out.println(ram.clg);

    }
}