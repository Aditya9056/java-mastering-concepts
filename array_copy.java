/**
 * array_copy
 */
public class array_copy {

    public static void copy(int arr1[], int arr2[], int size) {

        int i;

        for(i=0; i<6; i++){
            arr2[i] = arr1[i]; 
        }
        for(i=0; i<6; i++){
            System.out.println(arr2[i]);
        }
        
    }

    public static void main(String args[]) {
    
        int arr1[] = {1, 2, 67, 63, 43, 43};
        int arr2[] = {0, 0, 0, 0, 0, 0};

        copy(arr1, arr2, 6);

    }
}