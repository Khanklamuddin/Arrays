import java.util.*;
// Find lagest number in array 
public class findlargest{
    public static int getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // infinity

        for(int i=0; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,3,5};
        System.out.println("largest value is : " + getlargest);


    }
}