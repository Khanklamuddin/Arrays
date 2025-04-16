    public class binarysearch {
    public static int Binarysearch(int numbers[], int key) {
        // pahle start and end bna lete hain
        int start = 0, end = numbers.length-1;
        
        // loop chalayenge jab tak start <= end tab tak 
        while(start <= end) {
            int mid = (start + end)/2; // mid culculate 

            // compare karenge  
            if(numbers[mid] == key ){
                return mid;
            }
            if(numbers[mid] < key ){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main (String args[]) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;

        System.out.println("index for key is : " +binarysearch(numbers,key));
    }
}