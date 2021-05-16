/**
 * Aggregation
 */
class detail{
    int id;
    String addr;
}

class Employee{
    String name;
    detail data = new detail();

    void setData(String name, int id, String addr){
        data.id = id;
        data.addr = addr;
        this.name = name;
    }
    void display(){
        System.out.println(name);
        System.out.println(data.id);
        System.out.println(data.addr);
    }
}
public class Aggregation {

    public static void main(String[] args) {
        Employee ajay = new Employee();
        
        ajay.setData("ajay", 01, "Rampur, Hno. 34");
        ajay.display();

        Employee Ram = new Employee();
        Ram.setData("Ram", 02, "Rampur, Hno. 36");
        Ram.display();

    }
}