/**
 * abstract_method
 */

public class array {


    static void printArray(int arr[]){  
        for(int i=0;i<arr.length;i++)  
        System.out.println(arr[i]);  
        }  

    //Java Program to return an array from the method  
    class TestReturnArray{  
    //creating method which returns an array  
    int[] get(){  
    return new int[]{10,30,50,90,60};  
    } 

    public static void main(String[] args) {
     
        // dataType[] arr;
        // dataType []arr;
        // dataType arr[];
    
        int [] arr = {2, 4, 2, 5, 90};

        // for(int i= 0; i<5; i++)
        // System.out.println(arr[i]);

        int a[] = new int[6];
        a[0]=10;//initialization  
        a[1]=20;  
        a[2]=70;  
        a[3]=40;  
        a[4]=50;  
        //traversing array  

        
        // for(int i= 0; i<6; i++)
        // System.out.println(a[i]);


        // Traversing With For-Each
        for(int k : arr)
            // System.out.println(k);

    // Annonymous Array Passing
    printArray(new int[]{10,22,44,66});//passing anonymous array to method  
       
    }
}