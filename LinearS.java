public class LinearS{
    public static int linearSearch(int numbers[], int key) {

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i; // means key is found 
            }
        }
        return -1; // means key exist hi nahi karti
    }

    public static int linearsearch(String menu[], String key){
        for(int i=0; i<menu.length; i++){
            if(menu[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        // int numbers[] = {2,4,6,8,10,12,14,16};
        String menu[] = {"samosa", "dosa", "chole", "bhatoore"};
        // key = 10;
      String key = "pizza";

        // int index = linearSearch(numbers, key);
        int index = linearsearch(menu,key);
        if(index == -1){
            System.out.println("not found");
        }else{
            System.out.println("Key is at index : " + index);
        }


    }
}
