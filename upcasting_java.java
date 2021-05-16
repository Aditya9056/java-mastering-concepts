/**
Abstract Classes & Upcasting
 
*/
abstract class company {

String name;

void setData(String name){
this.name = name;
}    



}

class PortalaInc extends company{
    String type;
    int worth;

void setData(String type, int worth)
{
    this.type = type;
    this.worth = worth;
}

void display(){

System.out.println(this.type);
System.out.println(this.worth);

            }
}

public class upcasting_java {

    public static void main(String[] args) {
        company A_grade = new PortalaInc();

        A_grade.setData("");

        PortalaInc a = new PortalaInc();
        
        a.setData("PortalaInc", 400000);
        a.display();

    }
}