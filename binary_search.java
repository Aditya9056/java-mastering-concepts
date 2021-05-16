/**
 * binary_search
 */
public class binary_search {

    public static void main(String args[]) {
        
        int elements[] = {1, 12, 23, 29, 54, 56, 90}; 
        int search = 90, first = 0, last = 6;

        System.out.print(b_search(search, elements, first, last));
        
    }

    public static int b_search(int ele, int arr[], int start, int last) {
    
    int mid = (last+start)/2;
    
    while(start<=last){

        if(ele == arr[mid]){
            break;
        }else if(ele<arr[mid]){
            
            last = mid-1;
            mid = (last+start)/2;
        }else if(ele>arr[mid]){

            start = mid+1;
            mid = (last+start)/2;
        }

     }

    return mid+1;
        
    }


}