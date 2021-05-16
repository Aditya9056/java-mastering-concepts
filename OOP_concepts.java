/**
 * OOP_concepts
 */
class Student{  
    int id;  
    String name;  
    void setData(int i, String name){
        this.id = i;
        this.name = name;
    }
     Student(){
        id = 100;
        name = "Akshay";
    }

   }  

//Creating another class TestStudent1 which contains the main method  
 class OOP_concepts {

        public static void main(String args[]){  
         Student s1= new Student();  
        //  Intialization through refrence
        //  s1.id = 34;
        //  s1.name = "Raja";
        
        //  Intialization through method
        //  s1.setData(34, "RAJA");
        
        // Intialization through constructor

         System.out.println(s1.id);  
         System.out.println(s1.name);  
        }  
}