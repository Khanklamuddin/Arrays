import java.util.*;
// Reverse an array

public class Reversearr{
    public static void Reverse(int numbers[]){
        int first = 0, last = numbers.length-1;

        while(first < last) {
            // swap 
            int temp = numbers[last];
             numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10};
        Reverse(numbers);
        //print
        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
    }
}