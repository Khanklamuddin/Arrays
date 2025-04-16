import java.util.*;
// pairs in array 

public class pairsarr{
    public static void printpairs(int numbers[]) {
        int tp = 0;
        for(int i=0; i<numbers.length; i++) {
            int curr = numbers[i]; // 2 4 6 8 10
            for(int j=i+1; j<numbers.length; j++) {
                System.out.print("(" +curr + "," +numbers[j]+ ") "); // current ka next ke sath pair banana hai 
                tp++; // total pairs
            }
            System.out.println();
        }
        System.out.println("total pairs is : " +tp);
    }


public static void main(String args[]){
    int numbers[] = {2,4,6,8,10};
    printpairs(numbers);
}

}