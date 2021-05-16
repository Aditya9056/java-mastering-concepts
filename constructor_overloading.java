class constructor_overloading{  
    int id;  
    String name;  
    int age;  
    //creating two arg constructor  

    constructor_overloading(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    constructor_overloading(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){ 
         
    constructor_overloading s1 = new constructor_overloading(111,"Karan");  
    constructor_overloading s2 = new constructor_overloading(222,"Aryan",25);  
    s1.display();  
    s2.display();  
   }  
}