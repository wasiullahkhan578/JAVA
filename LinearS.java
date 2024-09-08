import java.util.*;
public class LinearS {

    public static int LSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Enter your Array Size.");
        Scanner sc =new Scanner (System.in);
        int size = sc.nextInt();
        System.out.println("Enter your array's element.");
        int numbers []= new int [size];
        for( int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println(" your array is "+ Arrays.toString(numbers));
        System.out.println("enter your key to find index .");
        int key = sc.nextInt();
        int index =LSearch(numbers, key);
        if(index== -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element is at index "+ index);
        }
        sc.close();
    }
}
