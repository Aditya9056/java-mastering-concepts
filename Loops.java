public class Loops{
    public static void main(String args[]){

        int i ,j;
        
        aa:
        for(i=0; i<10; i++)
        {
            System.out.println("Hello");
            bo:
            for(j =5; j<20; j++){
                System.out.print("Hello");
                if(i==j)
                {
                    break aa;
                }
            }
        }

        // while(i++<20){
        //     System.out.println(" World");
        // }

        // do{
        //     System.out.println("BLOOM");

        // }while(i++<30);
    }
}